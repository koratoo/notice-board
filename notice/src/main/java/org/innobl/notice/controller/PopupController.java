package org.innobl.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/popup")
public class PopupController {

    @GetMapping("/daily")
    public String getDailyNotice(){

        return "/notice/popup/d-notice";
    }

}
