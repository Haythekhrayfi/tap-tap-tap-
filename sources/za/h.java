package za;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.p;
import androidx.fragment.app.n;
import com.inscode.autoclicker.R;
import fd.j0;
import gb.y;
import kotlin.reflect.KProperty;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f45222f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.zipoapps.premiumhelper.ui.rate.c.a f45223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45225e;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getInt("theme", -1) : -1) != -1) {
            setStyle(1, getTheme());
        }
    }

    @Override // androidx.appcompat.app.p, androidx.fragment.app.k
    public Dialog onCreateDialog(Bundle bundle) {
        ma.h.a aVar = ma.h.f33410y;
        int rateDialogLayout = aVar.a().f33418g.f34205b.getRateDialogLayout();
        final int i10 = 0;
        if (rateDialogLayout == 0) {
            xe.a.b("PremiumHelper").b("Using default Rate dialog layout. Please set R.attr.rate_dialog_layout for custom rate dialog.", new Object[0]);
            rateDialogLayout = R.layout.ph_default_dialog_rate;
        }
        View viewInflate = LayoutInflater.from(getActivity()).inflate(rateDialogLayout, (ViewGroup) null);
        j0.h(viewInflate, "from(activity).inflate(layoutId, null)");
        viewInflate.findViewById(R.id.rate_dialog_positive_button).setOnClickListener(new View.OnClickListener(this) { // from class: za.g

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h f45221d;

            {
                this.f45221d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        h hVar = this.f45221d;
                        h.a aVar2 = h.f45222f;
                        j0.i(hVar, "this$0");
                        Bundle arguments = hVar.getArguments();
                        boolean zD = j0.d(arguments != null ? arguments.getString("arg_rate_source", null) : null, "relaunch");
                        n nVarRequireActivity = hVar.requireActivity();
                        j0.h(nVarRequireActivity, "requireActivity()");
                        c0.z(androidx.activity.i.l(nVarRequireActivity), null, null, new y(zD, nVarRequireActivity, null), 3, null);
                        ma.h.a aVar3 = ma.h.f33410y;
                        aVar3.a().f33417f.n("rate_intent", "positive");
                        aVar3.a().f33419h.q();
                        hVar.f45224d = true;
                        hVar.dismissAllowingStateLoss();
                        break;
                    case 1:
                        h hVar2 = this.f45221d;
                        h.a aVar4 = h.f45222f;
                        j0.i(hVar2, "this$0");
                        ma.h.f33410y.a().f33417f.n("rate_intent", "negative");
                        hVar2.f45225e = true;
                        hVar2.dismissAllowingStateLoss();
                        break;
                    default:
                        h hVar3 = this.f45221d;
                        h.a aVar5 = h.f45222f;
                        j0.i(hVar3, "this$0");
                        hVar3.dismissAllowingStateLoss();
                        break;
                }
            }
        });
        final int i11 = 1;
        viewInflate.findViewById(R.id.rate_dialog_negative_button).setOnClickListener(new View.OnClickListener(this) { // from class: za.g

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h f45221d;

            {
                this.f45221d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        h hVar = this.f45221d;
                        h.a aVar2 = h.f45222f;
                        j0.i(hVar, "this$0");
                        Bundle arguments = hVar.getArguments();
                        boolean zD = j0.d(arguments != null ? arguments.getString("arg_rate_source", null) : null, "relaunch");
                        n nVarRequireActivity = hVar.requireActivity();
                        j0.h(nVarRequireActivity, "requireActivity()");
                        c0.z(androidx.activity.i.l(nVarRequireActivity), null, null, new y(zD, nVarRequireActivity, null), 3, null);
                        ma.h.a aVar3 = ma.h.f33410y;
                        aVar3.a().f33417f.n("rate_intent", "positive");
                        aVar3.a().f33419h.q();
                        hVar.f45224d = true;
                        hVar.dismissAllowingStateLoss();
                        break;
                    case 1:
                        h hVar2 = this.f45221d;
                        h.a aVar4 = h.f45222f;
                        j0.i(hVar2, "this$0");
                        ma.h.f33410y.a().f33417f.n("rate_intent", "negative");
                        hVar2.f45225e = true;
                        hVar2.dismissAllowingStateLoss();
                        break;
                    default:
                        h hVar3 = this.f45221d;
                        h.a aVar5 = h.f45222f;
                        j0.i(hVar3, "this$0");
                        hVar3.dismissAllowingStateLoss();
                        break;
                }
            }
        });
        View viewFindViewById = viewInflate.findViewById(R.id.rate_dialog_dismiss_button);
        if (viewFindViewById != null) {
            final int i12 = 2;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: za.g

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ h f45221d;

                {
                    this.f45221d = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            h hVar = this.f45221d;
                            h.a aVar2 = h.f45222f;
                            j0.i(hVar, "this$0");
                            Bundle arguments = hVar.getArguments();
                            boolean zD = j0.d(arguments != null ? arguments.getString("arg_rate_source", null) : null, "relaunch");
                            n nVarRequireActivity = hVar.requireActivity();
                            j0.h(nVarRequireActivity, "requireActivity()");
                            c0.z(androidx.activity.i.l(nVarRequireActivity), null, null, new y(zD, nVarRequireActivity, null), 3, null);
                            ma.h.a aVar3 = ma.h.f33410y;
                            aVar3.a().f33417f.n("rate_intent", "positive");
                            aVar3.a().f33419h.q();
                            hVar.f45224d = true;
                            hVar.dismissAllowingStateLoss();
                            break;
                        case 1:
                            h hVar2 = this.f45221d;
                            h.a aVar4 = h.f45222f;
                            j0.i(hVar2, "this$0");
                            ma.h.f33410y.a().f33417f.n("rate_intent", "negative");
                            hVar2.f45225e = true;
                            hVar2.dismissAllowingStateLoss();
                            break;
                        default:
                            h hVar3 = this.f45221d;
                            h.a aVar5 = h.f45222f;
                            j0.i(hVar3, "this$0");
                            hVar3.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        }
        com.zipoapps.premiumhelper.a aVar2 = aVar.a().f33419h;
        KProperty<Object>[] kPropertyArr = com.zipoapps.premiumhelper.a.f28252m;
        aVar2.r(com.zipoapps.premiumhelper.a.b.DIALOG);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getActivity()).setView(viewInflate).create();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        j0.i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c = this.f45224d ? com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.DIALOG : com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE;
        com.zipoapps.premiumhelper.ui.rate.c.a aVar = this.f45223c;
        if (aVar != null) {
            aVar.a(enumC0239c, this.f45225e);
        }
    }
}
