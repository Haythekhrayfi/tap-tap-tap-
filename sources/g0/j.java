package g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static int a(Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    public static boolean b(TypedArray typedArray, int i10, int i11, boolean z10) {
        return typedArray.getBoolean(i10, typedArray.getBoolean(i11, z10));
    }

    public static float c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        return !i(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !i(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    public static String e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (i(xmlPullParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    public static int f(TypedArray typedArray, int i10, int i11, int i12) {
        return typedArray.getResourceId(i10, typedArray.getResourceId(i11, i12));
    }

    public static String g(TypedArray typedArray, int i10, int i11) {
        String string = typedArray.getString(i10);
        return string == null ? typedArray.getString(i11) : string;
    }

    public static CharSequence[] h(TypedArray typedArray, int i10, int i11) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        return textArray == null ? typedArray.getTextArray(i11) : textArray;
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }
}
