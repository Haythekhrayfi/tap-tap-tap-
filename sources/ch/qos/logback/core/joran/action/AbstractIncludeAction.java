package ch.qos.logback.core.joran.action;

import android.support.v4.media.j;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import defpackage.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractIncludeAction extends Action {
    private static final String FILE_ATTR = "file";
    private static final String OPTIONAL_ATTR = "optional";
    private static final String RESOURCE_ATTR = "resource";
    private static final String URL_ATTR = "url";
    private String attributeInUse;
    private boolean optional;

    private URL attributeToURL(String str) {
        StringBuilder sb2;
        String str2;
        try {
            URL url = new URL(str);
            url.openStream().close();
            return url;
        } catch (MalformedURLException e10) {
            e = e10;
            sb2 = new StringBuilder();
            sb2.append("URL [");
            sb2.append(str);
            str2 = "] is not well formed.";
            sb2.append(str2);
            optionalWarning(sb2.toString(), e);
            return null;
        } catch (IOException e11) {
            e = e11;
            sb2 = new StringBuilder();
            sb2.append("URL [");
            sb2.append(str);
            str2 = "] cannot be opened.";
            sb2.append(str2);
            optionalWarning(sb2.toString(), e);
            return null;
        }
    }

    private boolean checkAttributes(Attributes attributes) {
        String str;
        String value = attributes.getValue("file");
        String value2 = attributes.getValue("url");
        String value3 = attributes.getValue("resource");
        int i10 = !OptionHelper.isEmpty(value) ? 1 : 0;
        if (!OptionHelper.isEmpty(value2)) {
            i10++;
        }
        if (!OptionHelper.isEmpty(value3)) {
            i10++;
        }
        if (i10 == 0) {
            str = String.format("One of \"%1$s\", \"%2$s\" or \"%3$s\" attributes must be set.", "file", "resource", "url");
        } else {
            if (i10 <= 1) {
                if (i10 == 1) {
                    return true;
                }
                throw new IllegalStateException(j.a("Count value [", i10, "] is not expected"));
            }
            str = String.format("Only one of \"%1$s\", \"%2$s\" or \"%3$s\" attributes should be set.", "file", "resource", "url");
        }
        optionalWarning(str, null);
        return false;
    }

    private URL filePathAsURL(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            optionalWarning(androidx.activity.j.a("File does not exist [", str, "]"), new FileNotFoundException(str));
            return null;
        }
        try {
            return file.toURI().toURL();
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private URL getInputURL(InterpretationContext interpretationContext, Attributes attributes) {
        String value = attributes.getValue("file");
        String value2 = attributes.getValue("url");
        String value3 = attributes.getValue("resource");
        if (!OptionHelper.isEmpty(value)) {
            String strSubst = interpretationContext.subst(value);
            this.attributeInUse = strSubst;
            return filePathAsURL(strSubst);
        }
        if (!OptionHelper.isEmpty(value2)) {
            String strSubst2 = interpretationContext.subst(value2);
            this.attributeInUse = strSubst2;
            return attributeToURL(strSubst2);
        }
        if (OptionHelper.isEmpty(value3)) {
            throw new IllegalStateException("A URL stream should have been returned");
        }
        String strSubst3 = interpretationContext.subst(value3);
        this.attributeInUse = strSubst3;
        return resourceAsURL(strSubst3);
    }

    private URL resourceAsURL(String str) {
        URL resourceBySelfClassLoader = Loader.getResourceBySelfClassLoader(str);
        if (resourceBySelfClassLoader != null) {
            return resourceBySelfClassLoader;
        }
        optionalWarning("Could not find resource corresponding to [" + str + "]", null);
        return null;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        this.attributeInUse = null;
        this.optional = OptionHelper.toBoolean(attributes.getValue(OPTIONAL_ATTR), false);
        if (checkAttributes(attributes)) {
            try {
                URL inputURL = getInputURL(interpretationContext, attributes);
                if (inputURL != null) {
                    processInclude(interpretationContext, inputURL);
                }
            } catch (JoranException e10) {
                StringBuilder sbA = a.a("Error while parsing ");
                sbA.append(this.attributeInUse);
                optionalWarning(sbA.toString(), e10);
            }
        }
    }

    public void close(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
    }

    public String getAttributeInUse() {
        return this.attributeInUse;
    }

    public void handleError(String str, Exception exc) {
        if (exc == null || !((exc instanceof FileNotFoundException) || (exc instanceof UnknownHostException))) {
            addError(str, exc);
        } else {
            addWarn(str, exc);
        }
    }

    public boolean isOptional() {
        return this.optional;
    }

    public void optionalWarning(String str, Exception exc) {
        if (isOptional()) {
            return;
        }
        handleError(str, exc);
    }

    public abstract void processInclude(InterpretationContext interpretationContext, URL url) throws JoranException;
}
