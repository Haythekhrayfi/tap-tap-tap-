package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.redexgen.X.AnonymousClass75;
import com.facebook.ads.redexgen.X.C7K;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: assets/audience_network.dex */
@SubtypeOf({})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({AnonymousClass75.A09})
@DefaultFor(types = {Void.class})
@DefaultInUncheckedCodeFor({C7K.A0H, C7K.A0I})
@Documented
public @interface Nullable {
}
