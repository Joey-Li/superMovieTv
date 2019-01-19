/*
 * Copyright (C) 2014 Lucas Rocha
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.owen.tvrecyclerview.example.adapter;

import android.content.Context;

import com.owen.tvrecyclerview.example.R;
import com.owen.tvrecyclerview.example.domain.DetailInfo;
import com.owen.tvrecyclerview.example.domain.DetailItemInfo;
import com.owen.tvrecyclerview.example.domain.RecentUpdate;

import java.util.List;

public class DownItemAdapter extends CommonRecyclerViewAdapter<DetailItemInfo> {
    public DownItemAdapter(Context context) {
        super(context);
    }

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.d_item;
    }

    @Override
    public void onBindItemHolder(CommonRecyclerViewHolder helper,DetailItemInfo item, int position) {
        helper.getHolder()
                .setImageResource(R.id.image,item.getMvUrl().contains("magnet")?R.drawable.ic_dl_torrent:R.drawable.ic_dl_mp4)
                .setText(R.id.d_tv_changed,item.getMvUrl())
                .setText(R.id.title,item.getMvTitle())
        ;
    }
}
