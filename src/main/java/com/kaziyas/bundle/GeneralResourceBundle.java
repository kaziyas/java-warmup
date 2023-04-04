package com.kaziyas.bundle;

import java.util.*;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 04/April/2023
 * @project java-warmup
 */
public class GeneralResourceBundle extends ResourceBundle {
    private final List<String> bundles;
    private Map<String, String> resources = new HashMap<>();

    public GeneralResourceBundle(List<String> bundleNames) {
        this.bundles = bundleNames;
        loadBundles();
    }

    private void loadBundles() {
        for (String bundleName: bundles) {
            ResourceBundle bundle = ResourceBundle.getBundle(bundleName);
            Enumeration<String> keys = bundle.getKeys();
            ArrayList<String> keysList = Collections.list(keys);
            for (String key : keysList) {
                resources.put(key, bundle.getString(key));
            }
        }
    }

    @Override
    protected String handleGetObject(String key) {
        return resources.get(key);
    }

    @Override
    public Enumeration<String> getKeys() {
        return Collections.enumeration(resources.keySet());
    }
}
