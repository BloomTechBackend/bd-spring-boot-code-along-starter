package com.bloomtech.codealong.MagicEightBall.controller;

import com.bloomtech.codealong.MagicEightBall.dao.MagicEightBallDao;
import com.bloomtech.codealong.MagicEightBall.model.MagicEightBallResponse;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

public class MagicEightBallController {

    // Instantiate the Dao to be used to acquire data
    private MagicEightBallDao theEightBall = new MagicEightBallDao();

    /**
     * Handle HTTP POST requests for responses to questions
     *        with the URL: /magic8Ball/ask
     *
     * HTTP POST requests provide data for the request as JSON in the body of the request
     * The @RequestBody annotation tells Spring Boot to convert the JSON in the body to
     *     an object of the class specified
     */
    public MagicEightBallResponse getResponse() {
            return null;  // Placeholder return so class will compile
    }
    /**
     * Handle HTTP Get requests for responses to questions
     *        with the URL: /magic8Ball/ask?question="value"
     *
     * HTTP GET requests provide data for the request as a value in in the URL
     * The @RequestParam annotation tells Spring Boot to convert the request parameter name in the URL to
     *     an object of the class specified
     */
    public MagicEightBallResponse getResponse(@RequestParam String question) {
        return null;  // Placeholder return so class will compile
    }

    /*****************************************************************************************
     * Helper method to log a timestamp and a message provided
     *
     * @param message
     */
    private void logRequest(String message) {
            Long datetime = System.currentTimeMillis();
            Timestamp timestamp = new Timestamp(datetime);
            System.out.println(new Timestamp(datetime) + "\t--> " + message);
    }
}
