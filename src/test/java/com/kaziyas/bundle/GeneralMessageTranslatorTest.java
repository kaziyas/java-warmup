package com.kaziyas.bundle;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 05/April/2023
 * @project java-warmup
 */
public class GeneralMessageTranslatorTest {

    @Test
    public void getMessage_AValidKey_AValidValue() {
        Assert.assertEquals("Please enter an answer.", GeneralMessageTranslator.getMessage("account.update_password.security_answer.empty.error", null, null));
    }

    @Test
    public void getMessage_AValidKeyWithParameter_AValidValue() {
        Assert.assertEquals("This product will have a shipping charge of 1000 euro.", GeneralMessageTranslator.getMessage("shipping.override.productdetail", null, List.of("1000 euro")));
    }

    @Test
    public void getMessage_AnInValidKey_MessageDescription() {
        Assert.assertEquals("An invalid key is sent.", GeneralMessageTranslator.getMessage("test", "An invalid key is sent.", null));
    }
}