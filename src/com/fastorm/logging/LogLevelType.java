package com.fastorm.logging;

import android.graphics.Color;

public enum LogLevelType {
    TRACE, DEBUG, WARN, INFO, VERBOSE, ERROR, EXCEPTION, RUNTIME_EXCEPTION, FATAL_ERROR;

    LogLevelType(){}

    public static LogLevelType getLogType(LogLevelType type){
        switch (type){
            case TRACE:
                //temp
                break;
            case DEBUG:
                break;
            case WARN:
                break;
            case INFO:
                break;
            case VERBOSE:
                break;
            case ERROR:
                break;
            case EXCEPTION:
                break;
            case RUNTIME_EXCEPTION:
                break;
            case FATAL_ERROR:
                break;
            default:
                throw new UnsupportedOperationException("Invalid log level");
        }
        return type;
    }
}
