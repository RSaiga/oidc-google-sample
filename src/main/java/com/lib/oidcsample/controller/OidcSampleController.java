package com.lib.oidcsample.controller;

import com.lib.oidcsample.security.OpenIdConnectUserDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OidcSampleController {

    @RequestMapping("/")
    @ResponseBody
    public final String home(@AuthenticationPrincipal OpenIdConnectUserDetails user) {
        return "Username:" + user.getUsername();
    }
}
