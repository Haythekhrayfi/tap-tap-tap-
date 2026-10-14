package com.inscode.autoclicker.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageDialog extends Dialog {
    public static final Companion Companion = new Companion(null);
    public static final String MESSAGE_DIALOG_KEY = "message_last_code";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vc.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageDialog(Context context) {
        super(context);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        setContentView(R.layout.dialog_message);
    }

    public final void showIfRequired(int i10, String str) {
        j0.i(str, "message");
        Integer num = (Integer) k7.g.a(MESSAGE_DIALOG_KEY, 0);
        if (num != null && num.intValue() == i10) {
            return;
        }
        ((TextView) findViewById(R.id.dialogText)).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) findViewById(R.id.dialogText)).setText(Html.fromHtml(str));
        show();
        k7.g.b(MESSAGE_DIALOG_KEY, Integer.valueOf(i10));
    }
}
