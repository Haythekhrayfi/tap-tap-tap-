package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f23827a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f23828b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f23829c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap f23830d;

    static {
        HashMap map = new HashMap();
        f23830d = map;
        la0.a(-984833, map, "aliceblue", -332841, "antiquewhite", -16711681, "aqua", -8388652, "aquamarine");
        la0.a(-983041, map, "azure", -657956, "beige", -6972, "bisque", -16777216, "black");
        la0.a(-5171, map, "blanchedalmond", -16776961, "blue", -7722014, "blueviolet", -5952982, "brown");
        la0.a(-2180985, map, "burlywood", -10510688, "cadetblue", -8388864, "chartreuse", -2987746, "chocolate");
        la0.a(-32944, map, "coral", -10185235, "cornflowerblue", -1828, "cornsilk", -2354116, "crimson");
        la0.a(-16711681, map, "cyan", -16777077, "darkblue", -16741493, "darkcyan", -4684277, "darkgoldenrod");
        la0.a(-5658199, map, "darkgray", -16751616, "darkgreen", -5658199, "darkgrey", -4343957, "darkkhaki");
        la0.a(-7667573, map, "darkmagenta", -11179217, "darkolivegreen", -29696, "darkorange", -6737204, "darkorchid");
        la0.a(-7667712, map, "darkred", -1468806, "darksalmon", -7357297, "darkseagreen", -12042869, "darkslateblue");
        la0.a(-13676721, map, "darkslategray", -13676721, "darkslategrey", -16724271, "darkturquoise", -7077677, "darkviolet");
        la0.a(-60269, map, "deeppink", -16728065, "deepskyblue", -9868951, "dimgray", -9868951, "dimgrey");
        la0.a(-14774017, map, "dodgerblue", -5103070, "firebrick", -1296, "floralwhite", -14513374, "forestgreen");
        la0.a(-65281, map, "fuchsia", -2302756, "gainsboro", -460545, "ghostwhite", -10496, "gold");
        la0.a(-2448096, map, "goldenrod", -8355712, "gray", -16744448, "green", -5374161, "greenyellow");
        la0.a(-8355712, map, "grey", -983056, "honeydew", -38476, "hotpink", -3318692, "indianred");
        la0.a(-11861886, map, "indigo", -16, "ivory", -989556, "khaki", -1644806, "lavender");
        la0.a(-3851, map, "lavenderblush", -8586240, "lawngreen", -1331, "lemonchiffon", -5383962, "lightblue");
        la0.a(-1015680, map, "lightcoral", -2031617, "lightcyan", -329006, "lightgoldenrodyellow", -2894893, "lightgray");
        la0.a(-7278960, map, "lightgreen", -2894893, "lightgrey", -18751, "lightpink", -24454, "lightsalmon");
        la0.a(-14634326, map, "lightseagreen", -7876870, "lightskyblue", -8943463, "lightslategray", -8943463, "lightslategrey");
        la0.a(-5192482, map, "lightsteelblue", -32, "lightyellow", -16711936, "lime", -13447886, "limegreen");
        la0.a(-331546, map, "linen", -65281, "magenta", -8388608, "maroon", -10039894, "mediumaquamarine");
        la0.a(-16777011, map, "mediumblue", -4565549, "mediumorchid", -7114533, "mediumpurple", -12799119, "mediumseagreen");
        la0.a(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen", -12004916, "mediumturquoise", -3730043, "mediumvioletred");
        la0.a(-15132304, map, "midnightblue", -655366, "mintcream", -6943, "mistyrose", -6987, "moccasin");
        la0.a(-8531, map, "navajowhite", -16777088, "navy", -133658, "oldlace", -8355840, "olive");
        la0.a(-9728477, map, "olivedrab", -23296, "orange", -47872, "orangered", -2461482, "orchid");
        la0.a(-1120086, map, "palegoldenrod", -6751336, "palegreen", -5247250, "paleturquoise", -2396013, "palevioletred");
        la0.a(-4139, map, "papayawhip", -9543, "peachpuff", -3308225, "peru", -16181, "pink");
        la0.a(-2252579, map, "plum", -5185306, "powderblue", -8388480, "purple", -10079335, "rebeccapurple");
        la0.a(-65536, map, "red", -4419697, "rosybrown", -12490271, "royalblue", -7650029, "saddlebrown");
        la0.a(-360334, map, "salmon", -744352, "sandybrown", -13726889, "seagreen", -2578, "seashell");
        la0.a(-6270419, map, "sienna", -4144960, "silver", -7876885, "skyblue", -9807155, "slateblue");
        la0.a(-9404272, map, "slategray", -9404272, "slategrey", -1286, "snow", -16711809, "springgreen");
        la0.a(-12156236, map, "steelblue", -2968436, "tan", -16744320, "teal", -2572328, "thistle");
        la0.a(-40121, map, "tomato", 0, "transparent", -12525360, "turquoise", -1146130, "violet");
        la0.a(-663885, map, "wheat", -1, "white", -657931, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str) {
        return a(str, true);
    }

    private static int a(String str, boolean z10) {
        int i10;
        pa.a(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i11 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i11;
            }
            if (strReplace.length() == 9) {
                return ((i11 & 255) << 24) | (i11 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z10 ? f23829c : f23828b).matcher(strReplace);
            if (matcher.matches()) {
                if (z10) {
                    String strGroup = matcher.group(4);
                    Objects.requireNonNull(strGroup);
                    i10 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    Objects.requireNonNull(strGroup2);
                    i10 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                Objects.requireNonNull(strGroup3);
                int i12 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                Objects.requireNonNull(strGroup4);
                int i13 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                Objects.requireNonNull(strGroup5);
                return Color.argb(i10, i12, i13, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f23827a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                Objects.requireNonNull(strGroup6);
                int i14 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                Objects.requireNonNull(strGroup7);
                int i15 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                Objects.requireNonNull(strGroup8);
                return Color.rgb(i14, i15, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f23830d.get(na.b(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int b(String str) {
        return a(str, false);
    }
}
