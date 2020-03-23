package com.github.camel1984.mavendemo;

import org.apache.commons.lang3.StringUtils;

/**
 * CamelStringLib, used to test maven upload.
 */
public class CamelStringLib {
    /**
     * upperString, upper your string.
     * @param input input string.
     * @return string converted to upper case.
     */
    public String upperString(final String input) {
        return "1.0-" + StringUtils.upperCase(input);
    }
}
