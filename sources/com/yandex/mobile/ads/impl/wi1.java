package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class wi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f26291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f26292b;

    static {
        Locale locale = Locale.US;
        String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%2$s) { \n      %3$s.%1$s(JSON.stringify(%2$s)); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "onCollapse", "config", "AdPerformActionsJSI").replace("JSON.stringify()", "");
        String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%2$s) { \n      %3$s.%1$s(JSON.stringify(%2$s)); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "onExpand", "config", "AdPerformActionsJSI").replace("JSON.stringify()", "");
        f26292b = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function() { \n      return %2$s.%1$s(); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "getBannerInfo", "AdPerformActionsJSI");
        f26291a = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%3$s) { \n      return %4$s.%1$s(%2$s, %3$s); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "onAdRender", "document.querySelector('#rtb').offsetHeight", "testTag", "AdPerformActionsJSI");
    }
}
