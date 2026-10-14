package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class te0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f25345a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f25346b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25347c = 0;

    public static final class a {
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25348a;

        public b(int i10) {
            this.f25348a = i10;
        }
    }

    public static int a(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (b(str)) {
            return 1;
        }
        if (d(str)) {
            return 2;
        }
        if (c(str)) {
            return 3;
        }
        if ("image".equals((str == null || (iIndexOf = str.indexOf(47)) == -1) ? null : str.substring(0, iIndexOf))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f25345a.size();
        for (int i10 = 0; i10 < size; i10++) {
            Objects.requireNonNull(f25345a.get(i10));
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
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

    public static boolean a(String str, String str2) {
        b bVar;
        if (str == null) {
            return false;
        }
        char c10 = '\n';
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
                if (str2 == null) {
                    return false;
                }
                Matcher matcher = f25346b.matcher(str2);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    Objects.requireNonNull(strGroup);
                    String strGroup2 = matcher.group(2);
                    try {
                        Integer.parseInt(strGroup, 16);
                        bVar = new b(strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
                    } catch (NumberFormatException unused) {
                        bVar = null;
                    }
                    break;
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    return false;
                }
                int i10 = bVar.f25348a;
                if (i10 != 2) {
                    if (i10 == 5) {
                        c10 = 11;
                    } else if (i10 == 29) {
                        c10 = '\f';
                    } else if (i10 == 42) {
                        c10 = 16;
                    } else if (i10 != 22) {
                        c10 = i10 != 23 ? (char) 0 : (char) 15;
                    } else {
                        c10 = Ascii.MIN;
                    }
                }
                return (c10 == 0 || c10 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        b bVar;
        Objects.requireNonNull(str);
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null) {
                    return 0;
                }
                Matcher matcher = f25346b.matcher(str2);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    Objects.requireNonNull(strGroup);
                    String strGroup2 = matcher.group(2);
                    try {
                        Integer.parseInt(strGroup, 16);
                        bVar = new b(strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
                    } catch (NumberFormatException unused) {
                        bVar = null;
                    }
                    break;
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    return 0;
                }
                int i10 = bVar.f25348a;
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
        int iIndexOf;
        return "audio".equals((str == null || (iIndexOf = str.indexOf(47)) == -1) ? null : str.substring(0, iIndexOf));
    }

    public static boolean c(String str) {
        int iIndexOf;
        return "text".equals((str != null && (iIndexOf = str.indexOf(47)) != -1) ? str.substring(0, iIndexOf) : null) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean d(String str) {
        int iIndexOf;
        return "video".equals((str == null || (iIndexOf = str.indexOf(47)) == -1) ? null : str.substring(0, iIndexOf));
    }
}
