package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class w81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z81 f26212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f26213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f26214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f26215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w81 f26216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f26217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f26218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f26219m;

    private w81(String str, String str2, long j10, long j11, z81 z81Var, String[] strArr, String str3, String str4, w81 w81Var) {
        this.f26207a = str;
        this.f26208b = str2;
        this.f26215i = str4;
        this.f26212f = z81Var;
        this.f26213g = strArr;
        this.f26209c = str2 != null;
        this.f26210d = j10;
        this.f26211e = j11;
        this.f26214h = (String) pa.a(str3);
        this.f26216j = w81Var;
        this.f26217k = new HashMap<>();
        this.f26218l = new HashMap<>();
    }

    public static w81 a(String str) {
        return new w81(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static w81 a(String str, long j10, long j11, z81 z81Var, String[] strArr, String str2, String str3, w81 w81Var) {
        return new w81(str, null, j10, j11, z81Var, strArr, str2, str3, w81Var);
    }

    private void a(long j10, String str, ArrayList arrayList) {
        if (!"".equals(this.f26214h)) {
            str = this.f26214h;
        }
        if (a(j10) && "div".equals(this.f26207a) && this.f26215i != null) {
            arrayList.add(new Pair(str, this.f26215i));
            return;
        }
        for (int i10 = 0; i10 < a(); i10++) {
            a(i10).a(j10, str, arrayList);
        }
    }

    private void a(long j10, Map map, Map map2, String str, TreeMap treeMap) {
        if (a(j10)) {
            String str2 = "".equals(this.f26214h) ? str : this.f26214h;
            Iterator<Map.Entry<String, Integer>> it = this.f26218l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f26217k.containsKey(key) ? this.f26217k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    am.a aVar = (am.a) treeMap.get(key);
                    Objects.requireNonNull(aVar);
                    x81 x81Var = (x81) map2.get(str2);
                    Objects.requireNonNull(x81Var);
                    int i10 = x81Var.f26472j;
                    z81 z81VarA = y81.a(this.f26212f, this.f26213g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.e();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.a(spannableStringBuilder);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    if (z81VarA != null) {
                        y81.a(spannableStringBuilder2, iIntValue, iIntValue2, z81VarA, this.f26216j, map, i10);
                        if ("p".equals(this.f26207a)) {
                            if (z81VarA.j() != Float.MAX_VALUE) {
                                aVar.c((z81VarA.j() * (-90.0f)) / 100.0f);
                            }
                            if (z81VarA.l() != null) {
                                aVar.b(z81VarA.l());
                            }
                            if (z81VarA.g() != null) {
                                aVar.a(z81VarA.g());
                            }
                        }
                    }
                }
            }
            for (int i11 = 0; i11 < a(); i11++) {
                a(i11).a(j10, map, map2, str2, treeMap);
            }
        }
    }

    private void a(long j10, boolean z10, String str, TreeMap treeMap) {
        this.f26217k.clear();
        this.f26218l.clear();
        if ("metadata".equals(this.f26207a)) {
            return;
        }
        if (!"".equals(this.f26214h)) {
            str = this.f26214h;
        }
        if (this.f26209c && z10) {
            if (!treeMap.containsKey(str)) {
                am.a aVar = new am.a();
                aVar.a(new SpannableStringBuilder());
                treeMap.put(str, aVar);
            }
            CharSequence charSequenceE = ((am.a) treeMap.get(str)).e();
            Objects.requireNonNull(charSequenceE);
            String str2 = this.f26208b;
            Objects.requireNonNull(str2);
            ((SpannableStringBuilder) charSequenceE).append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.f26207a) && z10) {
            if (!treeMap.containsKey(str)) {
                am.a aVar2 = new am.a();
                aVar2.a(new SpannableStringBuilder());
                treeMap.put(str, aVar2);
            }
            CharSequence charSequenceE2 = ((am.a) treeMap.get(str)).e();
            Objects.requireNonNull(charSequenceE2);
            ((SpannableStringBuilder) charSequenceE2).append('\n');
            return;
        }
        if (a(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap<String, Integer> map = this.f26217k;
                String str3 = (String) entry.getKey();
                CharSequence charSequenceE3 = ((am.a) entry.getValue()).e();
                Objects.requireNonNull(charSequenceE3);
                map.put(str3, Integer.valueOf(charSequenceE3.length()));
            }
            boolean zEquals = "p".equals(this.f26207a);
            for (int i10 = 0; i10 < a(); i10++) {
                a(i10).a(j10, z10 || zEquals, str, treeMap);
            }
            if (zEquals) {
                if (!treeMap.containsKey(str)) {
                    am.a aVar3 = new am.a();
                    aVar3.a(new SpannableStringBuilder());
                    treeMap.put(str, aVar3);
                }
                CharSequence charSequenceE4 = ((am.a) treeMap.get(str)).e();
                Objects.requireNonNull(charSequenceE4);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceE4;
                int length = spannableStringBuilder.length() - 1;
                while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
                    spannableStringBuilder.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                HashMap<String, Integer> map2 = this.f26218l;
                String str4 = (String) entry2.getKey();
                CharSequence charSequenceE5 = ((am.a) entry2.getValue()).e();
                Objects.requireNonNull(charSequenceE5);
                map2.put(str4, Integer.valueOf(charSequenceE5.length()));
            }
        }
    }

    private void a(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f26207a);
        boolean zEquals2 = "div".equals(this.f26207a);
        if (z10 || zEquals || (zEquals2 && this.f26215i != null)) {
            long j10 = this.f26210d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f26211e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f26219m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f26219m.size(); i10++) {
            ((w81) this.f26219m.get(i10)).a(treeSet, z10 || zEquals);
        }
    }

    public final int a() {
        ArrayList arrayList = this.f26219m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final w81 a(int i10) {
        ArrayList arrayList = this.f26219m;
        if (arrayList != null) {
            return (w81) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final ArrayList a(long j10, Map map, Map map2, Map map3) {
        ArrayList<Pair> arrayList = new ArrayList();
        a(j10, this.f26214h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j10, false, this.f26214h, treeMap);
        a(j10, map, map2, this.f26214h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                x81 x81Var = (x81) map2.get(pair.first);
                Objects.requireNonNull(x81Var);
                arrayList2.add(new am.a().a(bitmapDecodeByteArray).b(x81Var.f26464b).b(0).a(0, x81Var.f26465c).a(x81Var.f26467e).d(x81Var.f26468f).a(x81Var.f26469g).c(x81Var.f26472j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            x81 x81Var2 = (x81) map2.get(entry.getKey());
            Objects.requireNonNull(x81Var2);
            am.a aVar = (am.a) entry.getValue();
            CharSequence charSequenceE = aVar.e();
            Objects.requireNonNull(charSequenceE);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceE;
            for (wo woVar : (wo[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wo.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(woVar), spannableStringBuilder.getSpanEnd(woVar), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.a(x81Var2.f26466d, x81Var2.f26465c);
            aVar.a(x81Var2.f26467e);
            aVar.b(x81Var2.f26464b);
            aVar.d(x81Var2.f26468f);
            aVar.b(x81Var2.f26470h, x81Var2.f26471i);
            aVar.c(x81Var2.f26472j);
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public final void a(w81 w81Var) {
        if (this.f26219m == null) {
            this.f26219m = new ArrayList();
        }
        this.f26219m.add(w81Var);
    }

    public final boolean a(long j10) {
        long j11 = this.f26210d;
        return (j11 == -9223372036854775807L && this.f26211e == -9223372036854775807L) || (j11 <= j10 && this.f26211e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f26211e) || (j11 <= j10 && j10 < this.f26211e));
    }

    public final long[] b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public final String[] c() {
        return this.f26213g;
    }
}
