package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.listener.StateUpdatedListener;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class w implements SplitInstallManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final av f12515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f12516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f12517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ax f12518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f12519e = new Handler(Looper.getMainLooper());

    public w(av avVar, t tVar, p pVar, ax axVar) {
        this.f12515a = avVar;
        this.f12516b = tVar;
        this.f12517c = pVar;
        this.f12518d = axVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> b(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Locale> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toLanguageTag());
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> cancelInstall(int i10) {
        return this.f12515a.b(i10);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        return this.f12515a.b(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return this.f12515a.c(b(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return this.f12515a.d(b(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredUninstall(List<String> list) {
        this.f12518d.a(list);
        return this.f12515a.a(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        Set<String> setB = this.f12517c.b();
        return setB == null ? Collections.emptySet() : setB;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        return this.f12517c.a();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<SplitInstallSessionState> getSessionState(int i10) {
        return this.f12515a.a(i10);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        return this.f12515a.a();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f12516b.a((StateUpdatedListener) splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i10) throws IntentSender.SendIntentException {
        return startConfirmationDialogForResult(splitInstallSessionState, new v(activity), i10);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int i10) throws IntentSender.SendIntentException {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        intentSenderForResultStarter.startIntentSenderForResult(splitInstallSessionState.resolutionIntent().getIntentSender(), i10, null, 0, 0, 0, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Integer> startInstall(SplitInstallRequest splitInstallRequest) {
        splitInstallRequest.getLanguages().isEmpty();
        List<Locale> languages = splitInstallRequest.getLanguages();
        Set<String> setB = this.f12517c.b();
        if (setB == null) {
            if (getInstalledModules().containsAll(splitInstallRequest.getModuleNames()) && Collections.disjoint(splitInstallRequest.getModuleNames(), this.f12518d.a())) {
                this.f12519e.post(new u(this, splitInstallRequest));
                return Tasks.a(0);
            }
        } else {
            HashSet hashSet = new HashSet();
            Iterator<Locale> it = languages.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getLanguage());
            }
            if (setB.containsAll(hashSet)) {
                if (getInstalledModules().containsAll(splitInstallRequest.getModuleNames())) {
                    this.f12519e.post(new u(this, splitInstallRequest));
                    return Tasks.a(0);
                }
            }
        }
        return this.f12515a.a(splitInstallRequest.getModuleNames(), b(splitInstallRequest.getLanguages()));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f12516b.b(splitInstallStateUpdatedListener);
    }
}
