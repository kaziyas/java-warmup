package com.kaziyas.bundle;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.MissingResourceException;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 04/April/2023
 * @project java-warmup
 */
public class GeneralMessageTranslator {
    private static final List<String> bundles = Collections.unmodifiableList(Arrays.asList("com.kaziyas.bundle.account", "com.kaziyas.bundle.shipping"));
    private static final GeneralResourceBundle resourceBundle = new GeneralResourceBundle(bundles);

    public static String getMessage(String key, String description, List<String> parameters) {
        String message;
        Object[] args = null;

        if (parameters != null)
            args = parameters.toArray();

        try {
            message = translate(key, args);
            if (message.isEmpty())
                message = MessageFormat.format(description, args);
        } catch (MissingResourceException | NullPointerException | IllegalArgumentException e) {
            message = description;
        }

        return message;
    }

    private static String translate(String key, Object[] arguments) {
        return MessageFormat.format(resourceBundle.handleGetObject(key), arguments);
    }
}
