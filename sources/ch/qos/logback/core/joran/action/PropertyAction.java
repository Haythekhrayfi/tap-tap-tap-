package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes.dex */
public class PropertyAction extends Action {
    public static String INVALID_ATTRIBUTES = "In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.";
    public static final String RESOURCE_ATTRIBUTE = "resource";

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String string;
        String strSubst;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        String str3;
        if ("substitutionProperty".equals(str)) {
            addWarn("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
        }
        String value = attributes.getValue("name");
        String value2 = attributes.getValue("value");
        ActionUtil.Scope scopeStringToScope = ActionUtil.stringToScope(attributes.getValue(Action.SCOPE_ATTRIBUTE));
        if (checkFileAttributeSanity(attributes)) {
            strSubst = interpretationContext.subst(attributes.getValue(Action.FILE_ATTRIBUTE));
            try {
                loadAndSetProperties(interpretationContext, new FileInputStream(strSubst), scopeStringToScope);
                return;
            } catch (FileNotFoundException unused) {
                sb3 = new StringBuilder();
                str3 = "Could not find properties file [";
            } catch (IOException e10) {
                e = e10;
                sb2 = new StringBuilder();
                str2 = "Could not read properties file [";
                sb2.append(str2);
                sb2.append(strSubst);
                sb2.append("].");
                addError(sb2.toString(), e);
                return;
            }
        } else if (checkResourceAttributeSanity(attributes)) {
            strSubst = interpretationContext.subst(attributes.getValue(RESOURCE_ATTRIBUTE));
            URL resourceBySelfClassLoader = Loader.getResourceBySelfClassLoader(strSubst);
            if (resourceBySelfClassLoader != null) {
                try {
                    loadAndSetProperties(interpretationContext, resourceBySelfClassLoader.openStream(), scopeStringToScope);
                    return;
                } catch (IOException e11) {
                    e = e11;
                    sb2 = new StringBuilder();
                    str2 = "Could not read resource file [";
                    sb2.append(str2);
                    sb2.append(strSubst);
                    sb2.append("].");
                    addError(sb2.toString(), e);
                    return;
                }
            }
            sb3 = new StringBuilder();
            str3 = "Could not find resource [";
            sb3.append(str3);
            sb3.append(strSubst);
            sb3.append("].");
            string = sb3.toString();
        } else {
            if (checkValueNameAttributesSanity(attributes)) {
                ActionUtil.setProperty(interpretationContext, value, interpretationContext.subst(RegularEscapeUtil.basicEscape(value2).trim()), scopeStringToScope);
                return;
            }
            string = INVALID_ATTRIBUTES;
        }
        addError(string);
    }

    public boolean checkFileAttributeSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue(Action.FILE_ATTRIBUTE)) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE));
    }

    public boolean checkResourceAttributeSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE)) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue(Action.FILE_ATTRIBUTE));
    }

    public boolean checkValueNameAttributesSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("name")) && !OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue(Action.FILE_ATTRIBUTE)) && OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE));
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }

    public void finish(InterpretationContext interpretationContext) {
    }

    public void loadAndSetProperties(InterpretationContext interpretationContext, InputStream inputStream, ActionUtil.Scope scope) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        inputStream.close();
        ActionUtil.setProperties(interpretationContext, properties, scope);
    }
}
