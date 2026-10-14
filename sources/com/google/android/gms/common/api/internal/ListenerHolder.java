package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class ListenerHolder<L> {
    private final Executor zaa;
    private volatile L zab;
    private volatile ListenerKey<L> zac;

    @KeepForSdk
    public static final class ListenerKey<L> {
        private final L zaa;
        private final String zab;

        @KeepForSdk
        public ListenerKey(L l10, String str) {
            this.zaa = l10;
            this.zab = str;
        }

        @KeepForSdk
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab);
        }

        @KeepForSdk
        public int hashCode() {
            return this.zab.hashCode() + (System.identityHashCode(this.zaa) * 31);
        }

        @KeepForSdk
        public String toIdString() {
            String str = this.zab;
            int iIdentityHashCode = System.identityHashCode(this.zaa);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
            sb2.append(str);
            sb2.append("@");
            sb2.append(iIdentityHashCode);
            return sb2.toString();
        }
    }

    @KeepForSdk
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(L l10);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    @KeepForSdk
    public ListenerHolder(Looper looper, L l10, String str) {
        this.zaa = new HandlerExecutor(looper);
        this.zab = (L) Preconditions.checkNotNull(l10, "Listener must not be null");
        this.zac = new ListenerKey<>(l10, Preconditions.checkNotEmpty(str));
    }

    @KeepForSdk
    public ListenerHolder(Executor executor, L l10, String str) {
        this.zaa = (Executor) Preconditions.checkNotNull(executor, "Executor must not be null");
        this.zab = (L) Preconditions.checkNotNull(l10, "Listener must not be null");
        this.zac = new ListenerKey<>(l10, Preconditions.checkNotEmpty(str));
    }

    @KeepForSdk
    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.zac;
    }

    @KeepForSdk
    public boolean hasListener() {
        return this.zab != null;
    }

    @KeepForSdk
    public void notifyListener(final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zaa.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                this.zaa.zaa(notifier);
            }
        });
    }

    public final void zaa(Notifier<? super L> notifier) {
        L l10 = this.zab;
        if (l10 == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(l10);
        } catch (RuntimeException e10) {
            notifier.onNotifyListenerFailed();
            throw e10;
        }
    }
}
