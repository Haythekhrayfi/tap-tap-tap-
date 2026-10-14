package com.applovin.exoplayer2.l;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f7653a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f7654b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7657c;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7659b;

        public b(int i10, int i11) {
            this.f7658a = i10;
            this.f7659b = i11;
        }

        public int a() {
            int i10 = this.f7659b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static String a(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static boolean a(String str) {
        return "audio".equals(h(str));
    }

    public static boolean a(String str, String str2) {
        b bVarG;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (bVarG = g(str2)) == null || (iA = bVarG.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        b bVarG;
        Objects.requireNonNull(str);
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarG = g(str2)) == null) {
                    return 0;
                }
                return bVarG.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static boolean b(String str) {
        return "video".equals(h(str));
    }

    public static boolean c(String str) {
        return "text".equals(h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static String d(String str) {
        b bVarG;
        String strA = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return "video/avc";
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (lowerCase.startsWith("av01")) {
            return "video/av01";
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (lowerCase.startsWith("mp4a")) {
            if (lowerCase.startsWith("mp4a.") && (bVarG = g(lowerCase)) != null) {
                strA = a(bVarG.f7658a);
            }
            return strA == null ? "audio/mp4a-latm" : strA;
        }
        if (lowerCase.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (lowerCase.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (lowerCase.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (lowerCase.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (lowerCase.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (lowerCase.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (lowerCase.startsWith("opus")) {
            return "audio/opus";
        }
        if (lowerCase.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (lowerCase.startsWith("flac")) {
            return "audio/flac";
        }
        if (lowerCase.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (lowerCase.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (lowerCase.contains("cea708")) {
            return "application/cea-708";
        }
        return (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? "application/cea-608" : i(lowerCase);
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if (c(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return j(str);
    }

    public static String f(String str) {
        Objects.requireNonNull(str);
        switch (str) {
            case "audio/x-flac":
                return "audio/flac";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return str;
        }
    }

    public static b g(String str) {
        Matcher matcher = f7654b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    private static String i(String str) {
        int size = f7653a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f7653a.get(i10);
            if (str.startsWith(aVar.f7656b)) {
                return aVar.f7655a;
            }
        }
        return null;
    }

    private static int j(String str) {
        int size = f7653a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f7653a.get(i10);
            if (str.equals(aVar.f7655a)) {
                return aVar.f7657c;
            }
        }
        return -1;
    }
}
