package com.yandex.mobile.ads.video.parser.offset;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.impl.aq0;
import com.yandex.mobile.ads.impl.ds0;
import com.yandex.mobile.ads.impl.q61;
import com.yandex.mobile.ads.impl.s61;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<q61> f28009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aq0 f28010b = new aq0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ds0 f28011c = new ds0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s61 f28012d = new s61();

    public a(HashSet hashSet) {
        this.f28009a = hashSet;
    }

    public final VastTimeOffset a(String str) {
        Long lValueOf;
        Integer numValueOf;
        Float fValueOf;
        Float fValueOf2;
        if (this.f28009a.contains(q61.f24326c) && "start".equals(str)) {
            return new VastTimeOffset(VastTimeOffset.b.f28005a, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        if (this.f28009a.contains(q61.f24327d) && "end".equals(str)) {
            return new VastTimeOffset(VastTimeOffset.b.f28006b, 100.0f);
        }
        boolean z10 = false;
        if (this.f28009a.contains(q61.f24325b) && str.endsWith("%")) {
            Objects.requireNonNull(this.f28010b);
            try {
                try {
                    fValueOf2 = Float.valueOf(str.substring(0, str.length() - 1));
                } catch (NumberFormatException unused) {
                    fValueOf2 = null;
                }
                float fFloatValue = fValueOf2.floatValue();
                if (fFloatValue >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && fFloatValue <= 100.0f) {
                    z10 = true;
                }
                fValueOf = z10 ? Float.valueOf(fFloatValue) : null;
            } catch (Throwable unused2) {
            }
            if (fValueOf != null) {
                return new VastTimeOffset(VastTimeOffset.b.f28006b, fValueOf.floatValue());
            }
            return null;
        }
        if (this.f28009a.contains(q61.f24328e) && str.startsWith("#")) {
            Objects.requireNonNull(this.f28011c);
            try {
                int i10 = Integer.parseInt(str.substring(1));
                numValueOf = i10 >= 1 ? Integer.valueOf(i10) : null;
            } catch (Exception unused3) {
            }
            if (numValueOf != null) {
                return new VastTimeOffset(VastTimeOffset.b.f28007c, numValueOf.intValue());
            }
            return null;
        }
        if (!this.f28009a.contains(q61.f24324a)) {
            return null;
        }
        Objects.requireNonNull(this.f28012d);
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
            lValueOf = Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
        } catch (ParseException unused4) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return new VastTimeOffset(VastTimeOffset.b.f28005a, lValueOf.longValue());
        }
        return null;
    }
}
