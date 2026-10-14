package g0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d[] f29664a;

        public c(d[] dVarArr) {
            this.f29664a = dVarArr;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f29667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f29668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f29669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f29670f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f29665a = str;
            this.f29666b = i10;
            this.f29667c = z10;
            this.f29668d = str2;
            this.f29669e = i11;
            this.f29670f = i12;
        }
    }

    /* JADX INFO: renamed from: g0.e$e, reason: collision with other inner class name */
    public static final class C0262e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m0.f f29671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f29673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f29674d;

        public C0262e(m0.f fVar, int i10, int i11) {
            this(fVar, i10, i11, null);
        }

        public C0262e(m0.f fVar, int i10, int i11, String str) {
            this.f29671a = fVar;
            this.f29673c = i10;
            this.f29672b = i11;
            this.f29674d = str;
        }
    }

    public static b a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c0.a.f3529b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlPullParser.next() != 3) {
                    c(xmlPullParser);
                }
                return new C0262e(new m0.f(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c0.a.f3530c);
                        int i10 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z10 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i11 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i12 = typedArrayObtainAttributes2.getInt(i11, 0);
                        int i13 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i13, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i13);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlPullParser.next() != 3) {
                            c(xmlPullParser);
                        }
                        arrayList.add(new d(string6, i10, z10, string5, i12, resourceId2));
                    } else {
                        c(xmlPullParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new c((d[]) arrayList.toArray(new d[0]));
            }
        } else {
            c(xmlPullParser);
        }
        return null;
    }

    public static List<List<byte[]>> b(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(d(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(d(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static List<byte[]> d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
