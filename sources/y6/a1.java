package y6;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import com.inscode.autoclicker.service.combine.CombinationActivity;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs;
import com.zipoapps.premiumhelper.ui.support.ContactSupportActivity;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a1 implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38100c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38103f;

    public /* synthetic */ a1(AlertDialog alertDialog, Context context, uc.l lVar) {
        this.f38101d = alertDialog;
        this.f38102e = context;
        this.f38103f = lVar;
    }

    public /* synthetic */ a1(ManualSettingsLoadActivity manualSettingsLoadActivity, View view, u6.a aVar) {
        this.f38101d = manualSettingsLoadActivity;
        this.f38102e = view;
        this.f38103f = aVar;
    }

    public /* synthetic */ a1(RecordSettingsLoadActivity recordSettingsLoadActivity, View view, v6.a aVar) {
        this.f38101d = recordSettingsLoadActivity;
        this.f38102e = view;
        this.f38103f = aVar;
    }

    public /* synthetic */ a1(CombinationActivity combinationActivity, View view, v6.a aVar) {
        this.f38101d = combinationActivity;
        this.f38102e = view;
        this.f38103f = aVar;
    }

    public /* synthetic */ a1(CombinedRecordingsActivity combinedRecordingsActivity, View view, t6.a aVar) {
        this.f38101d = combinedRecordingsActivity;
        this.f38102e = view;
        this.f38103f = aVar;
    }

    public /* synthetic */ a1(ContactSupportActivity contactSupportActivity, String str, String str2) {
        this.f38101d = contactSupportActivity;
        this.f38102e = str;
        this.f38103f = str2;
    }

    public /* synthetic */ a1(uc.l lVar, b7.a aVar, PopupWindow popupWindow) {
        this.f38101d = lVar;
        this.f38102e = aVar;
        this.f38103f = popupWindow;
    }

    public /* synthetic */ a1(uc.l lVar, List list, AlertDialog alertDialog) {
        this.f38101d = lVar;
        this.f38102e = list;
        this.f38103f = alertDialog;
    }

    public /* synthetic */ a1(uc.l lVar, vc.w wVar, AlertDialog alertDialog) {
        this.f38101d = lVar;
        this.f38102e = wVar;
        this.f38103f = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f38100c) {
            case 0:
                ManualSettingsLoadActivity manualSettingsLoadActivity = (ManualSettingsLoadActivity) this.f38101d;
                View view2 = (View) this.f38102e;
                u6.a aVar = (u6.a) this.f38103f;
                fd.j0.i(manualSettingsLoadActivity, "this$0");
                fd.j0.i(view2, "$itemView");
                fd.j0.i(aVar, "$item");
                PopupMenu popupMenu = new PopupMenu(manualSettingsLoadActivity, view2, 5);
                popupMenu.getMenu().add(manualSettingsLoadActivity.getString(R.string.rename));
                popupMenu.getMenu().add(manualSettingsLoadActivity.getString(R.string.export));
                popupMenu.getMenu().add(manualSettingsLoadActivity.getString(R.string.delete));
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new b1(manualSettingsLoadActivity, aVar));
                break;
            case 1:
                RecordSettingsLoadActivity recordSettingsLoadActivity = (RecordSettingsLoadActivity) this.f38101d;
                View view3 = (View) this.f38102e;
                v6.a aVar2 = (v6.a) this.f38103f;
                fd.j0.i(recordSettingsLoadActivity, "this$0");
                fd.j0.i(view3, "$itemView");
                fd.j0.i(aVar2, "$item");
                PopupMenu popupMenu2 = new PopupMenu(recordSettingsLoadActivity, view3, 5);
                popupMenu2.getMenu().add(recordSettingsLoadActivity.getString(R.string.rename));
                popupMenu2.getMenu().add(recordSettingsLoadActivity.getString(R.string.delete));
                popupMenu2.getMenu().add(recordSettingsLoadActivity.getString(R.string.export));
                popupMenu2.show();
                popupMenu2.setOnMenuItemClickListener(new b1(recordSettingsLoadActivity, aVar2));
                break;
            case 2:
                CombinationActivity combinationActivity = (CombinationActivity) this.f38101d;
                View view4 = (View) this.f38102e;
                v6.a aVar3 = (v6.a) this.f38103f;
                fd.j0.i(combinationActivity, "this$0");
                fd.j0.i(view4, "$itemView");
                fd.j0.i(aVar3, "$item");
                PopupMenu popupMenu3 = new PopupMenu(combinationActivity, view4, 5);
                popupMenu3.getMenu().add(combinationActivity.getString(R.string.edit_repeat_count));
                popupMenu3.getMenu().add(combinationActivity.getString(R.string.edit_playback_speed));
                popupMenu3.getMenu().add(combinationActivity.getString(R.string.edit_repeat_delay));
                popupMenu3.getMenu().add(combinationActivity.getString(R.string.delete));
                popupMenu3.show();
                popupMenu3.setOnMenuItemClickListener(new b1(combinationActivity, aVar3));
                break;
            case 3:
                CombinedRecordingsActivity combinedRecordingsActivity = (CombinedRecordingsActivity) this.f38101d;
                View view5 = (View) this.f38102e;
                t6.a aVar4 = (t6.a) this.f38103f;
                fd.j0.i(combinedRecordingsActivity, "this$0");
                fd.j0.i(view5, "$itemView");
                fd.j0.i(aVar4, "$item");
                PopupMenu popupMenu4 = new PopupMenu(combinedRecordingsActivity, view5, 5);
                popupMenu4.getMenu().add(combinedRecordingsActivity.getString(R.string.edit));
                popupMenu4.getMenu().add(combinedRecordingsActivity.getString(R.string.delete));
                popupMenu4.getMenu().add(combinedRecordingsActivity.getString(R.string.export));
                popupMenu4.getMenu().add(combinedRecordingsActivity.getString(R.string.create_launcher_shortcut));
                popupMenu4.show();
                popupMenu4.setOnMenuItemClickListener(new b1(combinedRecordingsActivity, aVar4));
                break;
            case 4:
                uc.l lVar = (uc.l) this.f38101d;
                b7.a aVar5 = (b7.a) this.f38102e;
                PopupWindow popupWindow = (PopupWindow) this.f38103f;
                fd.j0.i(lVar, "$onItemClick");
                fd.j0.i(aVar5, "$item");
                fd.j0.i(popupWindow, "$popupWindow");
                lVar.invoke(aVar5);
                if (popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
                break;
            case 5:
                ModeSettingsDialogs.Companion.showPauseBeforeRepeatDialog$lambda$34$lambda$32((AlertDialog) this.f38101d, (Context) this.f38102e, (uc.l) this.f38103f, view);
                break;
            case 6:
                ModeSettingsDialogs.Companion.showPlaybackSpeedDialog$lambda$60$lambda$58((uc.l) this.f38101d, (vc.w) this.f38102e, (AlertDialog) this.f38103f, view);
                break;
            case 7:
                ModeSettingsDialogs.Companion.showLoadRecordingsDialog$lambda$57$lambda$37((uc.l) this.f38101d, (List) this.f38102e, (AlertDialog) this.f38103f, view);
                break;
            default:
                ContactSupportActivity contactSupportActivity = (ContactSupportActivity) this.f38101d;
                String str = (String) this.f38102e;
                String str2 = (String) this.f38103f;
                ContactSupportActivity.a aVar6 = ContactSupportActivity.f28423f;
                fd.j0.i(contactSupportActivity, "this$0");
                fd.j0.i(str, "$email");
                gb.q.b(contactSupportActivity, str, str2, contactSupportActivity.g().getText().toString());
                contactSupportActivity.finish();
                break;
        }
    }
}
