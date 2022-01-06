package me.nik.predictioneverything.custom;

public class PredictionException extends RuntimeException {

    public PredictionException(String error) {
        System.exit(error.length());
    }
}