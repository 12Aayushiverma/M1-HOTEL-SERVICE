package com.example.HotelService.model;

public class Helper {

    public static CommonResponse getNullRequestResoponse() {
        CommonResponse  commonResoponse = new  CommonResponse();
        commonResoponse.setMessage(Message.NULL_REQUEST);
        commonResoponse.setStatusCode(Constant.NULL_REQUEST);

        return  commonResoponse;

    }

    public static CommonResponse getCommonExceptionResoponse() {
        CommonResponse  commonResoponse = new  CommonResponse();
        commonResoponse.setMessage(Message.SOMETHING_WENT_WRONG);
        commonResoponse.setStatusCode(Constant.ERROR_CD);

        return  commonResoponse;

    }
}
