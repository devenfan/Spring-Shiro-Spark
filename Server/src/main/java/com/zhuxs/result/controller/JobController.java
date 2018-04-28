package com.zhuxs.result.controller;

import com.zhuxs.result.exception.ResultException;
import com.zhuxs.result.bo.Count;
import com.zhuxs.result.domain.JobDao;
import com.zhuxs.result.dto.TextDto;
import com.zhuxs.result.service.WordCountService;
import com.zhuxs.result.utils.ApplicationUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by shusesshou on 2017/9/4.
 */
@RequestMapping(value = JobController.PATH,
        produces = MediaType.APPLICATION_JSON_VALUE)
@Controller
public class JobController {
    public static final String PATH = "jobs";

    public static final String SUBPATH_WORDCOUNT = "0";

    @Autowired
    private WordCountService wordCountService;

    @Autowired
    private JobDao jobDao;

    @PostMapping(value = SUBPATH_WORDCOUNT)
    public ResponseEntity<List<Count>> getCounts(@RequestBody TextDto words,
                                                 UriComponentsBuilder uriComponentsBuilder) throws ResultException{
        HttpHeaders headers = ApplicationUtil.getHttpHeaders(uriComponentsBuilder,PATH);
        Subject subject = SecurityUtils.getSubject();
        /**if(!subject.isPermitted("WORDCOUNT:CREATE")){
            throw  new ResultException("fuck shiro");
        } else {
            throw  new ResultException("fuck");
        }*/
        return new ResponseEntity<>(wordCountService.wordCount(words.getWords()),HttpStatus.OK);
    }
}
