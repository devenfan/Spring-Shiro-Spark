/**
 * Created by shusesshou on 2017/9/21.
 */
import Cookies from 'js-cookie'
import { login,logout,getUserInfo } from '../../api/login'
//import {getSessionId,setSessionId,removeSessionId} from '../../utils/sessionUtil'

const user = {
    state: {
        username: '',
        name: '',
        //sessionId: getSessionId(),
        token: '',
        roles:[],
        status: ''
    },
    mutations: {
        SET_USERNAME: (state, username) => {
            state.username = username
        },
        SET_NAME: (state, name) => {
            state.name = name
        },
        SET_TOKEN: (state, token) => {
            state.token = token
        },
        // SET_SESSIONID: (state,sessionId) => {
        //     state.sessionId = sessionId
        // },
        SET_ROLES: (state,roles) => {
            state.roles = roles
        },
        SET_STATUS: (state, status) => {
            state.status = status
        }
    },
    actions: {
        //用户名登录
        Login({ commit, state }, userInfo){
            const username = userInfo.username.trim()
            alert("UserLogin:" + JSON.stringify(state))
            return new Promise((resolve, reject) => {
                login(username, userInfo.password).then(response => {
                    commit('SET_NAME',response.data.name)
                    commit('SET_USERNAME',response.data.username)
                    commit('SET_TOKEN', response.data.token);
                    //commit('SET_STATUS',true)
                    resolve();
                }).catch(error => {
                    reject(error)
                })
            })
        },

        //获取用户信息
        GetUserInfo({ commit, state } ){
            alert("GetUserInfo:" + JSON.stringify(state))
            return new Promise((resolve,reject) => {
                getUserInfo().then(response => {
                    commit('SET_NAME',response.data.name)
                    commit('SET_USERNAME',response.data.username)
                    commit('SET_ROLES',response.data.roles)
                    //commit('SET_')
                    commit('SET_STATUS',true)
                    //alert(state.name)
                    resolve(response)
                }).catch(error => {
                    reject(error)
                })
            })
        },

        //登出
        LogOut({ commit, state }) {
            return new Promise((resolve,reject) => {
                alert("UserLogout:" + JSON.stringify(state))
                logout(state.token).then(() => {
                    commit('SET_NAME',"")
                    commit('SET_USERNAME',"")
                    // commit('SET_SESSIONID',"")
                    commit('SET_TOKEN',"")
                    commit('SET_ROLES',"")
                    //commit('SET_')
                    commit('SET_STATUS',false)
                    //removeSessionId()
                    resolve()
                })
            })
        }
    }
}

export default user

