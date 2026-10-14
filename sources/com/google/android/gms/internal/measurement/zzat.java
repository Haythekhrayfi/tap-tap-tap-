package com.google.android.gms.internal.measurement;

import androidx.activity.j;
import ch.qos.logback.core.pattern.parser.Parser;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return j.a("\"", this.zza, "\"");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0166  */
    /* JADX WARN: Code duplicated, block: B:103:0x0170  */
    /* JADX WARN: Code duplicated, block: B:104:0x0185  */
    /* JADX WARN: Code duplicated, block: B:105:0x019c  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01be  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:112:0x0214  */
    /* JADX WARN: Code duplicated, block: B:115:0x021e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0236  */
    /* JADX WARN: Code duplicated, block: B:119:0x0267  */
    /* JADX WARN: Code duplicated, block: B:121:0x0279  */
    /* JADX WARN: Code duplicated, block: B:122:0x028a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0296  */
    /* JADX WARN: Code duplicated, block: B:125:0x029b  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:142:0x0304  */
    /* JADX WARN: Code duplicated, block: B:144:0x0308 A[LOOP:0: B:143:0x0306->B:144:0x0308, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x031c  */
    /* JADX WARN: Code duplicated, block: B:148:0x032e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0342  */
    /* JADX WARN: Code duplicated, block: B:152:0x034e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0359  */
    /* JADX WARN: Code duplicated, block: B:156:0x036a  */
    /* JADX WARN: Code duplicated, block: B:157:0x037d  */
    /* JADX WARN: Code duplicated, block: B:160:0x038c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0397  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:165:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:169:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:170:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:172:0x0411  */
    /* JADX WARN: Code duplicated, block: B:174:0x0427  */
    /* JADX WARN: Code duplicated, block: B:177:0x043b  */
    /* JADX WARN: Code duplicated, block: B:179:0x043f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0482  */
    /* JADX WARN: Code duplicated, block: B:184:0x0494  */
    /* JADX WARN: Code duplicated, block: B:185:0x0497  */
    /* JADX WARN: Code duplicated, block: B:188:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:189:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:190:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:193:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:196:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:200:0x0518  */
    /* JADX WARN: Code duplicated, block: B:201:0x051b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0530  */
    /* JADX WARN: Code duplicated, block: B:206:0x0545  */
    /* JADX WARN: Code duplicated, block: B:210:0x055d  */
    /* JADX WARN: Code duplicated, block: B:212:0x0585  */
    /* JADX WARN: Code duplicated, block: B:215:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:223:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:225:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:228:0x05e4 A[LOOP:1: B:226:0x05de->B:228:0x05e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x0605  */
    /* JADX WARN: Code duplicated, block: B:233:0x0615  */
    /* JADX WARN: Code duplicated, block: B:234:0x062e  */
    /* JADX WARN: Code duplicated, block: B:247:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x010b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    /* JADX WARN: Code duplicated, block: B:80:0x0125  */
    /* JADX WARN: Code duplicated, block: B:82:0x012b  */
    /* JADX WARN: Code duplicated, block: B:84:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:87:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    /* JADX WARN: Code duplicated, block: B:92:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0154  */
    /* JADX WARN: Code duplicated, block: B:97:0x015e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0160 A[PHI: r4 r6
  0x0160: PHI (r4v53 java.lang.String) = (r4v3 java.lang.String), (r4v54 java.lang.String) binds: [B:96:0x015c, B:94:0x0151] A[DONT_GENERATE, DONT_INLINE]
  0x0160: PHI (r6v22 java.lang.String) = (r6v1 java.lang.String), (r6v23 java.lang.String) binds: [B:96:0x015c, B:94:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:203:0x0530, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        byte b10;
        String strZzi;
        int iZza;
        zzap zzatVar;
        zzat zzatVar2;
        StringBuilder sb2;
        int i10;
        zzap zzapVarZzb;
        double dDoubleValue;
        int i11;
        double dDoubleValue2;
        double dZza;
        zzap zzahVar;
        String strZzi2;
        zzap zzapVarZza;
        String str5;
        String str6;
        int iIndexOf;
        String str7;
        double dDoubleValue3;
        double dZza2;
        double dMin;
        double length;
        double dZza3;
        double dMin2;
        zzat zzatVar3;
        String str8;
        ArrayList arrayList;
        String strZzi3;
        long jZzd;
        String[] strArrSplit;
        int length2;
        boolean z10;
        int i12;
        int i13;
        boolean zIsEmpty;
        String str9;
        zzg zzgVar2;
        int iZza2;
        int length3;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !Parser.REPLACE_CONVERTER_WORD.equals(str) && !AppLovinEventTypes.USER_EXECUTED_SEARCH.equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                if (!"trim".equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            switch (str.hashCode()) {
                case -1789698943:
                    str3 = "charAt";
                    str4 = r4;
                    if (str.equals(str4)) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1776922004:
                    str3 = "charAt";
                    if (str.equals("toString")) {
                        b10 = 14;
                        str4 = r4;
                    }
                    str4 = "hasOwnProperty";
                    b10 = -1;
                    break;
                case -1464939364:
                    str3 = "charAt";
                    if (str.equals("toLocaleLowerCase")) {
                        b10 = 12;
                        str4 = r4;
                    }
                    str4 = "hasOwnProperty";
                    b10 = -1;
                    break;
                case -1361633751:
                    str3 = "charAt";
                    if (str.equals(str3)) {
                        b10 = 0;
                        str4 = r4;
                    }
                    str4 = "hasOwnProperty";
                    b10 = -1;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        b10 = 1;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        b10 = 13;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case -906336856:
                    if (str.equals(AppLovinEventTypes.USER_EXECUTED_SEARCH)) {
                        b10 = 7;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        b10 = 11;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        b10 = 4;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        b10 = 15;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 3568674:
                    if (str.equals("trim")) {
                        b10 = 16;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        b10 = 5;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        b10 = 8;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b10 = 9;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        b10 = 10;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 1094496948:
                    if (str.equals(Parser.REPLACE_CONVERTER_WORD)) {
                        b10 = 6;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        b10 = 3;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b10 = -1;
                    }
                    break;
                default:
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                    break;
            }
            strZzi = AdError.UNDEFINED_DOMAIN;
            switch (b10) {
                case 0:
                    zzh.zzj(str3, 1, list);
                    if (list.isEmpty()) {
                        iZza = 0;
                    } else {
                        iZza = (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                    }
                    String str10 = this.zza;
                    if (iZza >= 0 || iZza >= str10.length()) {
                        return zzap.zzm;
                    }
                    zzatVar = new zzat(String.valueOf(str10.charAt(iZza)));
                    return zzatVar;
                case 1:
                    zzatVar2 = this;
                    if (!list.isEmpty()) {
                        sb2 = new StringBuilder(zzatVar2.zza);
                        for (i10 = 0; i10 < list.size(); i10++) {
                            sb2.append(zzgVar.zzb((zzap) list.get(i10)).zzi());
                        }
                        return new zzat(sb2.toString());
                    }
                    return zzatVar2;
                case 2:
                    zzh.zzh(str4, 1, list);
                    String str11 = this.zza;
                    zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                    if (!"length".equals(zzapVarZzb.zzi())) {
                        dDoubleValue = zzapVarZzb.zzh().doubleValue();
                        if (dDoubleValue == Math.floor(dDoubleValue) || (i11 = (int) dDoubleValue) < 0 || i11 >= str11.length()) {
                            return zzap.zzl;
                        }
                    }
                    return zzap.zzk;
                case 3:
                    zzh.zzj("indexOf", 2, list);
                    String str12 = this.zza;
                    if (list.size() > 0) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    }
                    zzatVar = new zzah(Double.valueOf(str12.indexOf(strZzi, (int) zzh.zza(list.size() >= 2 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : 0.0d))));
                    return zzatVar;
                case 4:
                    zzh.zzj("lastIndexOf", 2, list);
                    String str13 = this.zza;
                    if (list.size() > 0) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    }
                    String str14 = strZzi;
                    if (list.size() < 2) {
                        dDoubleValue2 = Double.NaN;
                    } else {
                        dDoubleValue2 = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                    }
                    if (Double.isNaN(dDoubleValue2)) {
                        dZza = Double.POSITIVE_INFINITY;
                    } else {
                        dZza = zzh.zza(dDoubleValue2);
                    }
                    zzahVar = new zzah(Double.valueOf(str13.lastIndexOf(str14, (int) dZza)));
                    return zzahVar;
                case 5:
                    zzh.zzj("match", 1, list);
                    String str15 = this.zza;
                    if (list.size() <= 0) {
                        strZzi2 = "";
                    } else {
                        strZzi2 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    }
                    Matcher matcher = Pattern.compile(strZzi2).matcher(str15);
                    return matcher.find() ? new zzae(Arrays.asList(new zzat(matcher.group()))) : zzap.zzg;
                case 6:
                    zzatVar2 = this;
                    zzh.zzj(Parser.REPLACE_CONVERTER_WORD, 2, list);
                    zzapVarZza = zzap.zzf;
                    if (!list.isEmpty()) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                        if (list.size() > 1) {
                            zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                        }
                    }
                    str5 = strZzi;
                    str6 = zzatVar2.zza;
                    iIndexOf = str6.indexOf(str5);
                    if (iIndexOf >= 0) {
                        if (zzapVarZza instanceof zzai) {
                            zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str5), new zzah(Double.valueOf(iIndexOf)), zzatVar2));
                        }
                        zzahVar = new zzat(j.a(str6.substring(0, iIndexOf), zzapVarZza.zzi(), str6.substring(str5.length() + iIndexOf)));
                        return zzahVar;
                    }
                    return zzatVar2;
                case 7:
                    zzh.zzj(AppLovinEventTypes.USER_EXECUTED_SEARCH, 1, list);
                    if (!list.isEmpty()) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    }
                    Matcher matcher2 = Pattern.compile(strZzi).matcher(this.zza);
                    return matcher2.find() ? new zzah(Double.valueOf(matcher2.start())) : new zzah(Double.valueOf(-1.0d));
                case 8:
                    zzh.zzj("slice", 2, list);
                    str7 = this.zza;
                    if (list.isEmpty()) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue();
                    }
                    dZza2 = zzh.zza(dDoubleValue3);
                    if (dZza2 < 0.0d) {
                        dMin = Math.max(((double) str7.length()) + dZza2, 0.0d);
                    } else {
                        dMin = Math.min(dZza2, str7.length());
                    }
                    int i14 = (int) dMin;
                    if (list.size() > 1) {
                        length = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                    } else {
                        length = str7.length();
                    }
                    dZza3 = zzh.zza(length);
                    if (dZza3 < 0.0d) {
                        dMin2 = Math.max(((double) str7.length()) + dZza3, 0.0d);
                    } else {
                        dMin2 = Math.min(dZza3, str7.length());
                    }
                    zzatVar3 = new zzat(str7.substring(i14, Math.max(0, ((int) dMin2) - i14) + i14));
                    return zzatVar3;
                case 9:
                    zzh.zzj("split", 2, list);
                    str8 = this.zza;
                    if (str8.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        strZzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                        if (list.size() > 1) {
                            jZzd = zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                        } else {
                            jZzd = 2147483647L;
                        }
                        if (jZzd == 0) {
                            return new zzae();
                        }
                        strArrSplit = str8.split(Pattern.quote(strZzi3), ((int) jZzd) + 1);
                        length2 = strArrSplit.length;
                        if (strZzi3.isEmpty() || length2 <= 0) {
                            z10 = false;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i12 = length2 - 1;
                            if (!strArrSplit[i12].isEmpty()) {
                            }
                            i13 = zIsEmpty;
                            z10 = zIsEmpty;
                            if (length2 > jZzd) {
                                i12--;
                            }
                            while (i13 < i12) {
                                arrayList.add(new zzat(strArrSplit[i13]));
                                i13++;
                            }
                        }
                        i13 = zIsEmpty;
                        z10 = zIsEmpty;
                        i12 = length2;
                        i13 = z10;
                        i13 = zIsEmpty;
                        z10 = zIsEmpty;
                        if (length2 > jZzd) {
                            i12--;
                        }
                        while (i13 < i12) {
                            arrayList.add(new zzat(strArrSplit[i13]));
                            i13++;
                        }
                    }
                    return new zzae(arrayList);
                case 10:
                    zzh.zzj("substring", 2, list);
                    str9 = this.zza;
                    if (list.isEmpty()) {
                        zzgVar2 = zzgVar;
                        iZza2 = 0;
                    } else {
                        zzgVar2 = zzgVar;
                        iZza2 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                    }
                    if (list.size() > 1) {
                        length3 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue());
                    } else {
                        length3 = str9.length();
                    }
                    int iMin = Math.min(Math.max(iZza2, 0), str9.length());
                    int iMin2 = Math.min(Math.max(length3, 0), str9.length());
                    zzatVar3 = new zzat(str9.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                    return zzatVar3;
                case 11:
                    zzh.zzh(str2, 0, list);
                    return new zzat(this.zza.toUpperCase());
                case 12:
                    zzh.zzh("toLocaleLowerCase", 0, list);
                    return new zzat(this.zza.toLowerCase());
                case 13:
                    zzh.zzh("toLowerCase", 0, list);
                    return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
                case 14:
                    zzatVar2 = this;
                    zzh.zzh("toString", 0, list);
                    return zzatVar2;
                case 15:
                    zzh.zzh("toUpperCase", 0, list);
                    return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
                case 16:
                    zzh.zzh("toUpperCase", 0, list);
                    return new zzat(this.zza.trim());
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        switch (str.hashCode()) {
            case -1789698943:
                str3 = "charAt";
                str4 = r4;
                if (str.equals(str4)) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
                break;
            case -1776922004:
                str3 = "charAt";
                if (str.equals("toString")) {
                    b10 = 14;
                    str4 = r4;
                }
                str4 = "hasOwnProperty";
                b10 = -1;
                break;
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b10 = 12;
                    str4 = r4;
                }
                str4 = "hasOwnProperty";
                b10 = -1;
                break;
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    b10 = 0;
                    str4 = r4;
                }
                str4 = "hasOwnProperty";
                b10 = -1;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b10 = 1;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b10 = 13;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case -906336856:
                if (str.equals(AppLovinEventTypes.USER_EXECUTED_SEARCH)) {
                    b10 = 7;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b10 = 11;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b10 = 4;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b10 = 15;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    b10 = 16;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    b10 = 5;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b10 = 8;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b10 = 9;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b10 = 10;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 1094496948:
                if (str.equals(Parser.REPLACE_CONVERTER_WORD)) {
                    b10 = 6;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b10 = 3;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = -1;
                }
                break;
            default:
                str3 = "charAt";
                str4 = "hasOwnProperty";
                b10 = -1;
                break;
        }
        strZzi = AdError.UNDEFINED_DOMAIN;
        switch (b10) {
            case 0:
                zzh.zzj(str3, 1, list);
                if (list.isEmpty()) {
                    iZza = (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                } else {
                    iZza = 0;
                }
                String str16 = this.zza;
                if (iZza >= 0) {
                    break;
                }
                return zzap.zzm;
            case 1:
                zzatVar2 = this;
                if (!list.isEmpty()) {
                    sb2 = new StringBuilder(zzatVar2.zza);
                    while (i10 < list.size()) {
                        sb2.append(zzgVar.zzb((zzap) list.get(i10)).zzi());
                    }
                    return new zzat(sb2.toString());
                }
                return zzatVar2;
            case 2:
                zzh.zzh(str4, 1, list);
                String str17 = this.zza;
                zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                if (!"length".equals(zzapVarZzb.zzi())) {
                    dDoubleValue = zzapVarZzb.zzh().doubleValue();
                    if (dDoubleValue == Math.floor(dDoubleValue)) {
                        break;
                    }
                    return zzap.zzl;
                }
                return zzap.zzk;
            case 3:
                zzh.zzj("indexOf", 2, list);
                String str18 = this.zza;
                if (list.size() > 0) {
                    strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                zzatVar = new zzah(Double.valueOf(str18.indexOf(strZzi, (int) zzh.zza(list.size() >= 2 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : 0.0d))));
                return zzatVar;
            case 4:
                zzh.zzj("lastIndexOf", 2, list);
                String str19 = this.zza;
                if (list.size() > 0) {
                    strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                String str110 = strZzi;
                if (list.size() < 2) {
                    dDoubleValue2 = Double.NaN;
                } else {
                    dDoubleValue2 = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                }
                if (Double.isNaN(dDoubleValue2)) {
                    dZza = Double.POSITIVE_INFINITY;
                } else {
                    dZza = zzh.zza(dDoubleValue2);
                }
                zzahVar = new zzah(Double.valueOf(str19.lastIndexOf(str110, (int) dZza)));
                return zzahVar;
            case 5:
                zzh.zzj("match", 1, list);
                String str111 = this.zza;
                if (list.size() <= 0) {
                    strZzi2 = "";
                } else {
                    strZzi2 = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                Matcher matcher3 = Pattern.compile(strZzi2).matcher(str111);
                if (matcher3.find()) {
                }
            case 6:
                zzatVar2 = this;
                zzh.zzj(Parser.REPLACE_CONVERTER_WORD, 2, list);
                zzapVarZza = zzap.zzf;
                if (!list.isEmpty()) {
                    strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                    }
                }
                str5 = strZzi;
                str6 = zzatVar2.zza;
                iIndexOf = str6.indexOf(str5);
                if (iIndexOf >= 0) {
                    if (zzapVarZza instanceof zzai) {
                        zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str5), new zzah(Double.valueOf(iIndexOf)), zzatVar2));
                    }
                    zzahVar = new zzat(j.a(str6.substring(0, iIndexOf), zzapVarZza.zzi(), str6.substring(str5.length() + iIndexOf)));
                    return zzahVar;
                }
                return zzatVar2;
            case 7:
                zzh.zzj(AppLovinEventTypes.USER_EXECUTED_SEARCH, 1, list);
                if (!list.isEmpty()) {
                    strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                Matcher matcher4 = Pattern.compile(strZzi).matcher(this.zza);
                if (matcher4.find()) {
                }
            case 8:
                zzh.zzj("slice", 2, list);
                str7 = this.zza;
                if (list.isEmpty()) {
                    dDoubleValue3 = zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                dZza2 = zzh.zza(dDoubleValue3);
                if (dZza2 < 0.0d) {
                    dMin = Math.max(((double) str7.length()) + dZza2, 0.0d);
                } else {
                    dMin = Math.min(dZza2, str7.length());
                }
                int i15 = (int) dMin;
                if (list.size() > 1) {
                    length = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                } else {
                    length = str7.length();
                }
                dZza3 = zzh.zza(length);
                if (dZza3 < 0.0d) {
                    dMin2 = Math.max(((double) str7.length()) + dZza3, 0.0d);
                } else {
                    dMin2 = Math.min(dZza3, str7.length());
                }
                zzatVar3 = new zzat(str7.substring(i15, Math.max(0, ((int) dMin2) - i15) + i15));
                return zzatVar3;
            case 9:
                zzh.zzj("split", 2, list);
                str8 = this.zza;
                if (str8.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    strZzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        jZzd = zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                    } else {
                        jZzd = 2147483647L;
                    }
                    if (jZzd == 0) {
                        return new zzae();
                    }
                    strArrSplit = str8.split(Pattern.quote(strZzi3), ((int) jZzd) + 1);
                    length2 = strArrSplit.length;
                    if (strZzi3.isEmpty()) {
                        z10 = false;
                        i13 = zIsEmpty;
                        z10 = zIsEmpty;
                        i12 = length2;
                        i13 = z10;
                    } else {
                        z10 = false;
                        i13 = zIsEmpty;
                        z10 = zIsEmpty;
                        i12 = length2;
                        i13 = z10;
                    }
                    i13 = zIsEmpty;
                    z10 = zIsEmpty;
                    if (length2 > jZzd) {
                        i12--;
                    }
                    while (i13 < i12) {
                        arrayList.add(new zzat(strArrSplit[i13]));
                        i13++;
                    }
                }
                return new zzae(arrayList);
            case 10:
                zzh.zzj("substring", 2, list);
                str9 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZza2 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                } else {
                    zzgVar2 = zzgVar;
                    iZza2 = 0;
                }
                if (list.size() > 1) {
                    length3 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue());
                } else {
                    length3 = str9.length();
                }
                int iMin3 = Math.min(Math.max(iZza2, 0), str9.length());
                int iMin4 = Math.min(Math.max(length3, 0), str9.length());
                zzatVar3 = new zzat(str9.substring(Math.min(iMin3, iMin4), Math.max(iMin3, iMin4)));
                return zzatVar3;
            case 11:
                zzh.zzh(str2, 0, list);
                return new zzat(this.zza.toUpperCase());
            case 12:
                zzh.zzh("toLocaleLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase());
            case 13:
                zzh.zzh("toLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzatVar2 = this;
                zzh.zzh("toString", 0, list);
                return zzatVar2;
            case 15:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        double d10;
        if (this.zza.isEmpty()) {
            d10 = 0.0d;
        } else {
            try {
                return Double.valueOf(this.zza);
            } catch (NumberFormatException unused) {
                d10 = Double.NaN;
            }
        }
        return Double.valueOf(d10);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
