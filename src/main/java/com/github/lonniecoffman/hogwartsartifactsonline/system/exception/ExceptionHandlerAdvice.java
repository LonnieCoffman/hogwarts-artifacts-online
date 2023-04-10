package com.github.lonniecoffman.hogwartsartifactsonline.system.exception;

import com.github.lonniecoffman.hogwartsartifactsonline.artifact.ArtifactNotFoundException;
import com.github.lonniecoffman.hogwartsartifactsonline.system.Result;
import com.github.lonniecoffman.hogwartsartifactsonline.system.StatusCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(ArtifactNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    Result handleArtifactNotFoundException(ArtifactNotFoundException ex) {
        return new Result(false, StatusCode.NOT_FOUND, ex.getMessage());
    }

}
