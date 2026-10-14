package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class hs0 {

    public static class a<T> implements gs0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends gs0<? super T>> f21505a;

        private a(List<? extends gs0<? super T>> list) {
            this.f21505a = list;
        }

        public /* synthetic */ a(List list, int i10) {
            this(list);
        }

        @Override // com.yandex.mobile.ads.impl.gs0
        public final boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f21505a.size(); i10++) {
                if (!this.f21505a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(@CheckForNull Object obj) {
            if (obj instanceof a) {
                return this.f21505a.equals(((a) obj).f21505a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f21505a.hashCode() + 306654252;
        }

        public final String toString() {
            List<? extends gs0<? super T>> list = this.f21505a;
            StringBuilder sb2 = new StringBuilder("Predicates.");
            sb2.append("and");
            sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            boolean z10 = true;
            for (T t10 : list) {
                if (!z10) {
                    sb2.append(CoreConstants.COMMA_CHAR);
                }
                sb2.append(t10);
                z10 = false;
            }
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb2.toString();
        }
    }

    public static <T> gs0<T> a(gs0<? super T> gs0Var, gs0<? super T> gs0Var2) {
        Objects.requireNonNull(gs0Var);
        Objects.requireNonNull(gs0Var2);
        return new a(Arrays.asList(gs0Var, gs0Var2), 0);
    }
}
