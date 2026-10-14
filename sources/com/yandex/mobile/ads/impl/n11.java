package com.yandex.mobile.ads.impl;

import java.io.File;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class n11 extends qg {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f23201g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f23202h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f23203i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f23204j = 0;

    private n11(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0090  */
    public static n11 a(File file, long j10, long j11, ug ugVar) {
        File file2;
        long j12;
        String strGroup;
        File file3;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = f23202h.matcher(name2);
            if (matcher.matches()) {
                String strGroup2 = matcher.group(1);
                Objects.requireNonNull(strGroup2);
                strGroup = da1.e(strGroup2);
            } else {
                matcher = f23201g.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    Objects.requireNonNull(strGroup);
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                file3 = null;
            } else {
                File file4 = (File) pa.b(file.getParentFile());
                int i10 = ugVar.b(strGroup).f25359a;
                String strGroup3 = matcher.group(2);
                Objects.requireNonNull(strGroup3);
                long j13 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                Objects.requireNonNull(strGroup4);
                long j14 = Long.parseLong(strGroup4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10);
                sb2.append(".");
                sb2.append(j13);
                sb2.append(".");
                file3 = new File(file4, android.support.v4.media.session.e.a(sb2, j14, ".v3.exo"));
                if (!file.renameTo(file3)) {
                    file3 = null;
                }
            }
            if (file3 == null) {
                return null;
            }
            name = file3.getName();
            file2 = file3;
        }
        Matcher matcher2 = f23203i.matcher(name);
        if (!matcher2.matches()) {
            return null;
        }
        String strGroup5 = matcher2.group(1);
        Objects.requireNonNull(strGroup5);
        String strA = ugVar.a(Integer.parseInt(strGroup5));
        if (strA == null) {
            return null;
        }
        long length = j10 == -1 ? file2.length() : j10;
        if (length == 0) {
            return null;
        }
        String strGroup6 = matcher2.group(2);
        Objects.requireNonNull(strGroup6);
        long j15 = Long.parseLong(strGroup6);
        if (j11 == -9223372036854775807L) {
            String strGroup7 = matcher2.group(3);
            Objects.requireNonNull(strGroup7);
            j12 = Long.parseLong(strGroup7);
        } else {
            j12 = j11;
        }
        return new n11(strA, j15, length, j12, file2);
    }

    public static n11 a(String str, long j10) {
        return new n11(str, j10, -1L, -9223372036854775807L, null);
    }

    public static n11 a(String str, long j10, long j11) {
        return new n11(str, j10, j11, -9223372036854775807L, null);
    }

    public final n11 a(File file, long j10) {
        pa.b(this.f24486d);
        return new n11(this.f24483a, this.f24484b, this.f24485c, j10, file);
    }
}
