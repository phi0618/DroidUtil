package com.phi.xutils.utils;

import junit.framework.TestCase;

public class VerifyUtilsTest extends TestCase {

    public void testIsNumeric() {
        assertTrue(VerifyUtils.isNumeric("-12.11"));
        assertTrue(VerifyUtils.isNumeric("12"));
        assertTrue(VerifyUtils.isNumeric("0.123"));
        assertTrue(VerifyUtils.isNumeric("-12"));
        assertFalse(VerifyUtils.isNumeric("12.2.1"));
        assertFalse(VerifyUtils.isNumeric("12z12"));
    }

    public void testIsEmail() {
        assertTrue(VerifyUtils.isEmail("z@z.com"));
        assertFalse(VerifyUtils.isEmail("zz.com"));
        assertFalse(VerifyUtils.isEmail("zz@zcom"));
        assertFalse(VerifyUtils.isEmail("zz@.com"));
        assertFalse(VerifyUtils.isEmail("zz@z."));
    }


    public void testIsPhone() {
        assertTrue(VerifyUtils.isPhone("15088888888"));
        assertFalse(VerifyUtils.isPhone("150888888887"));
        assertFalse(VerifyUtils.isPhone("1508888a18"));
    }

    public void testIsIdCard() {
        assertFalse(VerifyUtils.isIdCard("51012820010728231x"));
    }
}