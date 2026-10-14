package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.b;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.util.FileSize;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcey extends WebChromeClient {
    private final zzcez zza;

    public zzcey(zzcez zzcezVar) {
        this.zza = zzcezVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcez)) {
            return webView.getContext();
        }
        zzcez zzcezVar = (zzcez) webView;
        Activity activityZzi = zzcezVar.zzi();
        return activityZzi != null ? activityZzi : zzcezVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof zzcez) {
            com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = ((zzcez) webView).zzL();
            if (zzlVarZzL != null) {
                zzlVarZzL.zzb();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        zzbzr.zzj(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        String strA = b.a(q2.a.a("JS: ", strMessage, " (", strSourceId, ":"), consoleMessage.lineNumber(), ")");
        if (strA.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = zzcex.zza[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            zzbzr.zzg(strA);
        } else if (i10 == 2) {
            zzbzr.zzj(strA);
        } else if (i10 == 3 || i10 == 4 || i10 != 5) {
            zzbzr.zzi(strA);
        } else {
            zzbzr.zze(strA);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzH() != null) {
            webView2.setWebViewClient(this.zza.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = 5242880 - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > FileSize.MB_COEFFICIENT) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(Math.min(131072L, j13) + j10, FileSize.MB_COEFFICIENT);
        } else {
            if (j11 <= Math.min(FileSize.MB_COEFFICIENT - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z10;
        if (callback != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzw(this.zza.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z10 = true;
            } else {
                com.google.android.gms.ads.internal.zzt.zzp();
                if (com.google.android.gms.ads.internal.util.zzs.zzw(this.zza.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            callback.invoke(str, z10, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = this.zza.zzL();
        if (zzlVarZzL == null) {
            zzbzr.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzlVarZzL.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = this.zza.zzL();
        if (zzlVarZzL == null) {
            zzbzr.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzlVarZzL.zzC(view, customViewCallback);
            zzlVarZzL.zzA(i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        AlertDialog alertDialogCreate;
        com.google.android.gms.ads.internal.zzb zzbVarZzd;
        try {
            zzcez zzcezVar = this.zza;
            if (zzcezVar != null && zzcezVar.zzN() != null && this.zza.zzN().zzd() != null && (zzbVarZzd = this.zza.zzN().zzd()) != null && !zzbVarZzd.zzc()) {
                zzbVarZzd.zzb("window." + str + "('" + str3 + "')");
                return false;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(context);
            builderZzG.setTitle(str2);
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                alertDialogCreate = builderZzG.setView(linearLayout).setPositiveButton(R.string.ok, new zzcew(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzcev(jsPromptResult)).setOnCancelListener(new zzceu(jsPromptResult)).create();
            } else {
                alertDialogCreate = builderZzG.setMessage(str3).setPositiveButton(R.string.ok, new zzcet(jsResult)).setNegativeButton(R.string.cancel, new zzces(jsResult)).setOnCancelListener(new zzcer(jsResult)).create();
            }
            alertDialogCreate.show();
            return true;
        } catch (WindowManager.BadTokenException e10) {
            zzbzr.zzk("Fail to display Dialog.", e10);
        }
    }
}
