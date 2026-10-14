package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.facebook.ads.redexgen.X.AnonymousClass75;
import com.facebook.ads.redexgen.X.C7J;
import com.facebook.ads.redexgen.X.C7K;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: assets/audience_network.dex */
@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {C7J.A0I, C7J.A0C, C7J.A04, C7J.A06, C7J.A08, C7J.A0B, C7J.A0E, C7J.A0J, C7J.A05})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({AnonymousClass75.A0B})
@DefaultFor({C7K.A05})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({C7K.A0E, C7K.A0C})
@Documented
public @interface NonNull {
}
