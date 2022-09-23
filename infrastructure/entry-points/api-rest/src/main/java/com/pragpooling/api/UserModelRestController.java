package com.pragpooling.api;

import com.pragpooling.dto.request.UserRqDTO;
import com.pragpooling.dto.response.UserRsDTO;
import com.pragpooling.usecase.user.UserModelUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class UserModelRestController {

    private final UserModelUseCase userModelUseCase;

    @PostMapping("/")
    public ResponseEntity<UserRsDTO> saveUserModel (@Valid @RequestBody UserRqDTO userRqDTO) {
        UserRsDTO userResponse = userModelUseCase.saveUserModel(userRqDTO);
        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);

    }

    @GetMapping("/all")
    public ResponseEntity<List<UserRsDTO>> getAllUserModel () {
        List<UserRsDTO> userResponse = userModelUseCase.getAllUserModel();
        return new ResponseEntity<>(userResponse, HttpStatus.OK);

    }


}
