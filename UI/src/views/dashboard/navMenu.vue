<template>
    <Menu mode="horizontal" :theme="theme1" active-name="1">
        <MenuItem name="1">
            <Icon type="ios-paper"></Icon>
            WordCount
        </MenuItem>
        <MenuItem name="2" >
            <label @click="handleLogout">logout</label>
        </MenuItem>
    </Menu>
</template>
<script>
    export default {
        data () {
            return {
                theme1: 'light'
            }
        },
        methods: {
            handleLogout() {
                alert("handleLogout: " + JSON.stringify(this.$store.state.user));
                //this.$store.dispatch('LogOut', this.$store.state.user);
                this.$store.dispatch('LogOut');
            }
        }
    }
</script>