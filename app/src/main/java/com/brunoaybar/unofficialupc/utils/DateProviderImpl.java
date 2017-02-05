package com.brunoaybar.unofficialupc.utils;

import com.brunoaybar.unofficialupc.utils.interfaces.DateProvider;

import java.util.Date;

/**
 * Created by brunoaybar on 05/02/2017.
 */

public class DateProviderImpl implements DateProvider{

    @Override
    public Date getNow() {
        return new Date();
    }

    @Override
    public Date getNever() {
        return new Date(0);
    }
}