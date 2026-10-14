package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f2370e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, Constructor<?>> f2371f = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2372a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f2374c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f2373b = new Object[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f2375d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public j(Context context, k kVar) {
        this.f2372a = context;
        this.f2374c = kVar;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
        Class<?> cls;
        Constructor<?> constructor = f2371f.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f2372a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e10 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e11) {
                                e10 = e11;
                            }
                        }
                        if (cls == null) {
                            if (e10 != null) {
                                throw e10;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f2370e);
                    constructor.setAccessible(true);
                    f2371f.put(str, constructor);
                } catch (ClassNotFoundException e12) {
                    throw e12;
                }
            } catch (Exception e13) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e13);
                throw inflateException;
            }
        }
        Object[] objArr = this.f2373b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f2375d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    public Preference c(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f2373b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f2373b[0] = this.f2372a;
            do {
                try {
                    try {
                        try {
                            next = xmlPullParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (XmlPullParserException e10) {
                            InflateException inflateException = new InflateException(e10.getMessage());
                            inflateException.initCause(e10);
                            throw inflateException;
                        }
                    } catch (InflateException e11) {
                        throw e11;
                    }
                } catch (IOException e12) {
                    InflateException inflateException2 = new InflateException(xmlPullParser.getPositionDescription() + ": " + e12.getMessage());
                    inflateException2.initCause(e12);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) b(xmlPullParser.getName(), attributeSetAsAttributeSet);
            if (preferenceGroup == null) {
                preferenceGroup2.p(this.f2374c);
                preferenceGroup = preferenceGroup2;
            }
            d(xmlPullParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    public final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long jLongValue;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f2296n = Intent.parseIntent(this.f2372a.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e10) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e10);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.f2372a.getResources();
                    if (preference.f2298p == null) {
                        preference.f2298p = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f2298p);
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e11) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e11);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.P.contains(preferenceB)) {
                        if (preferenceB.f2295m != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.J;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            String str = preferenceB.f2295m;
                            if (preferenceGroup2.I(str) != null) {
                                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                            }
                        }
                        if (preferenceB.f2290h == Integer.MAX_VALUE) {
                            if (preferenceGroup.Q) {
                                int i10 = preferenceGroup.R;
                                preferenceGroup.R = i10 + 1;
                                preferenceB.C(i10);
                            }
                            if (preferenceB instanceof PreferenceGroup) {
                                ((PreferenceGroup) preferenceB).Q = preferenceGroup.Q;
                            }
                        }
                        int iBinarySearch = Collections.binarySearch(preferenceGroup.P, preferenceB);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (iBinarySearch * (-1)) - 1;
                        }
                        boolean zG = preferenceGroup.G();
                        if (preferenceB.f2305w == zG) {
                            preferenceB.f2305w = !zG;
                            preferenceB.n(preferenceB.G());
                            preferenceB.m();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.P.add(iBinarySearch, preferenceB);
                        }
                        k kVar = preferenceGroup.f2286d;
                        String str2 = preferenceB.f2295m;
                        if (str2 == null) {
                            synchronized (kVar) {
                                jLongValue = kVar.f2377b;
                                kVar.f2377b = 1 + jLongValue;
                            }
                        } else {
                            if (preferenceGroup.O.e(str2) >= 0) {
                                jLongValue = preferenceGroup.O.getOrDefault(str2, null).longValue();
                                preferenceGroup.O.remove(str2);
                            } else {
                                synchronized (kVar) {
                                    jLongValue = kVar.f2377b;
                                    kVar.f2377b = 1 + jLongValue;
                                }
                            }
                        }
                        preferenceB.f2287e = jLongValue;
                        preferenceB.f2288f = true;
                        try {
                            preferenceB.p(kVar);
                            preferenceB.f2288f = false;
                            if (preferenceB.J != null) {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                            preferenceB.J = preferenceGroup;
                            if (preferenceGroup.S) {
                                preferenceB.o();
                            }
                            Preference.b bVar = preferenceGroup.H;
                            if (bVar != null) {
                                h hVar = (h) bVar;
                                hVar.f2360g.removeCallbacks(hVar.f2361h);
                                hVar.f2360g.post(hVar.f2361h);
                            }
                        } catch (Throwable th) {
                            preferenceB.f2288f = false;
                            throw th;
                        }
                    }
                    d(xmlPullParser, preferenceB, attributeSet);
                }
            }
        }
    }
}
