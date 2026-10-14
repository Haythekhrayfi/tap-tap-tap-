package ch.qos.logback.core.util;

import com.developer.filepicker.model.DialogConfigs;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class LocationUtil {
    public static final String CLASSPATH_SCHEME = "classpath:";
    public static final String SCHEME_PATTERN = "^\\p{Alpha}[\\p{Alnum}+.-]*:.*$";

    public static URL urlForResource(String str) throws MalformedURLException, FileNotFoundException {
        URL url;
        Objects.requireNonNull(str, "location is required");
        if (!str.matches(SCHEME_PATTERN)) {
            url = Loader.getResourceBySelfClassLoader(str);
        } else if (str.startsWith(CLASSPATH_SCHEME)) {
            String strSubstring = str.substring(10);
            if (strSubstring.startsWith(DialogConfigs.DIRECTORY_SEPERATOR)) {
                strSubstring = strSubstring.substring(1);
            }
            if (strSubstring.length() == 0) {
                throw new MalformedURLException("path is required");
            }
            url = Loader.getResourceBySelfClassLoader(strSubstring);
        } else {
            url = new URL(str);
        }
        if (url != null) {
            return url;
        }
        throw new FileNotFoundException(str);
    }
}
