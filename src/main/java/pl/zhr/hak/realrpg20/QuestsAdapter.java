package pl.zhr.hak.realrpg20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuestsAdapter extends RecyclerView.Adapter<QuestsAdapter.QuestsViewHolder> {


    class QuestsViewHolder extends RecyclerView.ViewHolder {

        private final TextView tytulZadania;
        private final TextView trescZadania;

        public QuestsViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tytulZadania = itemView.findViewById(R.id.textTytulZadania);
            this.trescZadania = itemView.findViewById(R.id.textTrescZadania);
        }
    }

        private List<Quests> mQuestsList;
        private final LayoutInflater mInflater;
        private Context mContext;

        public QuestsAdapter(List<Quests> questsList, Context context){
            this.mQuestsList = questsList;
            this.mContext = context;
            mInflater = LayoutInflater.from(context);
        }

        @NonNull
        @Override
        public QuestsAdapter.QuestsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = mInflater.inflate(R.layout.view_diary, parent, false);
            return new QuestsViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull QuestsAdapter.QuestsViewHolder holder, int position) {
        holder.tytulZadania.setText(mQuestsList.get(position).getTytulZadania());
        holder.trescZadania.setText(String.valueOf(mQuestsList.get(position).getTrescZadania()));
        }

        @Override
        public int getItemCount() {
            return mQuestsList.size();
        }

        void SetQuests(List<Quests> quests){
            mQuestsList = quests;
            notifyDataSetChanged();
        }
}
