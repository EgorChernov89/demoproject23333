package com.example.demoproject23333.controller;


import com.example.demoproject23333.model.Response;
import com.example.demoproject23333.dto.ResponseDto;
import com.example.demoproject23333.services.ObjParamsService;
import com.example.test.jwt.JwtAuthentication;
import com.example.test.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/v2")
@RequiredArgsConstructor
public class RestfullController {

    private final AuthService authService;
    private final ObjParamsService objParamsService;

    @PreAuthorize("hasAuthority('USER')")
    @GetMapping("/hello/user")
    public ResponseEntity<String> helloUser() {
        final JwtAuthentication authInfo = authService.getAuthInfo();
        return ResponseEntity.ok("user:" + authInfo.getPrincipal());
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/hello/admin")
    public ResponseEntity<String> helloAdmin() {
        final JwtAuthentication authInfo = authService.getAuthInfo();
        return ResponseEntity.ok("admin:" + authInfo.getPrincipal());
    }


    @PostMapping("/putRawParams")
    public Response getRawParams(@RequestBody ResponseDto responseDto){
        return objParamsService.saveResponseFromJson(responseDto);

    }

//    @GetMapping("/greeting")
////    @PreAuthorize("isAuthenticated()")
//    public MessageResponse userAccess() {
//
//        return new MessageResponse("Up Up");
//    }
}
