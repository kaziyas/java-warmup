package com.kaziyas.bundle;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 05/April/2023
 * @project java-warmup
 */
public class GeneralResourceBundleTest {
    private GeneralResourceBundle resourceBundle;
    @Before
    public void setup() {
        List<String> bundles = Collections.unmodifiableList(Arrays.asList("com.kaziyas.bundle.account", "com.kaziyas.bundle.shipping"));
        resourceBundle = new GeneralResourceBundle(bundles);
    }
    @Test
    public void handleGetObject() {
        assertEquals("Please enter a valid password.", resourceBundle.handleGetObject("account.update_password.new_password.error.required"));
    }

    @Test
    public void getKeys() {
        long size = Collections.list(resourceBundle.getKeys()).size();
        assertEquals(3, size);
    }
}