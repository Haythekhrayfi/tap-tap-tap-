package com.yandex.mobile.ads.impl;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class da implements Comparable<da> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f19795f = Pattern.compile("^[\\d]*(\\.[\\d]*)*(\\-.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f19797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f19799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19800e = true;

    public da(String str) {
        this.f19796a = str.toLowerCase(Locale.US);
        a();
    }

    private void a() {
        int i10;
        String[] strArrSplit = this.f19796a.split("-");
        int i11 = 0;
        if (!f19795f.matcher(this.f19796a).matches()) {
            this.f19800e = false;
        }
        String[] strArrSplit2 = strArrSplit[0].split("\\.");
        if (this.f19800e) {
            this.f19797b = new int[strArrSplit2.length];
            while (true) {
                int[] iArr = this.f19797b;
                if (i11 >= iArr.length) {
                    break;
                }
                iArr[i11] = Integer.parseInt(strArrSplit2[i11]);
                i11++;
            }
            int iIndexOf = this.f19796a.indexOf(45);
            if (iIndexOf < 0 || iIndexOf >= this.f19796a.length() - 1) {
                i10 = 2;
            } else {
                String strSubstring = this.f19796a.substring(iIndexOf);
                this.f19798c = strSubstring;
                i10 = !strSubstring.endsWith("-snapshot") ? 1 : 0;
            }
            this.f19799d = Integer.valueOf(i10);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(da daVar) {
        int iCompareTo;
        int i10;
        boolean z10 = this.f19800e;
        if (!z10 || !daVar.f19800e) {
            if (!z10) {
                if (daVar.f19800e || (iCompareTo = this.f19796a.compareTo(daVar.f19796a)) < 0) {
                    return -1;
                }
                if (iCompareTo <= 0) {
                    return 0;
                }
            }
            return 1;
        }
        int iMax = Math.max(this.f19797b.length, daVar.f19797b.length);
        int i11 = 0;
        while (true) {
            if (i11 >= iMax) {
                i10 = 0;
                break;
            }
            int[] iArr = this.f19797b;
            int i12 = i11 >= iArr.length ? 0 : iArr[i11];
            int[] iArr2 = daVar.f19797b;
            int i13 = i11 >= iArr2.length ? 0 : iArr2[i11];
            if (i12 > i13) {
                i10 = 1;
                break;
            }
            if (i12 < i13) {
                i10 = -1;
                break;
            }
            i11++;
        }
        if (i10 != 0) {
            return i10;
        }
        if (!this.f19799d.equals(daVar.f19799d)) {
            return this.f19799d.compareTo(daVar.f19799d);
        }
        if (!this.f19799d.equals(2)) {
            int iCompareTo2 = this.f19798c.compareTo(daVar.f19798c);
            if (iCompareTo2 < 0) {
                return -1;
            }
            if (iCompareTo2 > 0) {
                return 1;
            }
        }
        return 0;
    }
}
