/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fastorm.logging;

import javax.inject.Inject;
import java.io.File;

public class LoggerImpl implements ILogger{

    @Inject
    private ILogger mLogger;

    public LoggerImpl(){}

    public LoggerImpl(ILogger logger){
        mLogger = logger;
    }

    private final Logger logger = new Logger(mLogger);


    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public boolean isWarnEnabled() {
        return false;
    }

    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    @Override
    public boolean isVerboseEnabled() {
        return false;
    }

    @Override
    public boolean isErrorEnabled() {
        return false;
    }

    @Override
    public boolean isExceptionEnabled() {
        return false;
    }

    @Override
    public boolean isRuntimeExceptionEnabled() {
        return false;
    }

    @Override
    public boolean isFatalErrorEnabled() {
        return false;
    }

    @Override
    public void trace(File file, String message, Throwable throwable) {
        logger.writeTraceLog(file,message,throwable);
    }

    @Override
    public void debug(File file, String message, Throwable throwable) {
        logger.writeDebugLog(file,message,throwable);
    }

    @Override
    public void warn(File file, String message, Throwable throwable) {
        logger.writeWarnLog(file,message,throwable);
    }

    @Override
    public void info(File file, String message, Throwable throwable) {
        logger.writeInfoLog(file,message,throwable);
    }

    @Override
    public void verbose(File file, String message, Throwable throwable) {
        logger.writeVerboseLog(file,message,throwable);
    }

    @Override
    public void error(File file, String message, Throwable throwable) {
        logger.writeErrorLog(file,message,throwable);
    }

    @Override
    public void exception(File file, String message, Throwable throwable) {
        logger.writeExceptionLog(file,message,throwable);
    }

    @Override
    public void printRuntimeException(File file, String message, Throwable throwable) {
        logger.writeRuntimeException(file,message,throwable);
    }

    @Override
    public void printFatalError(File file, String message, Throwable throwable) {
        logger.writeFatalErrorLog(file,message,throwable);
    }
}
