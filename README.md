# android-sample-mvp

## 役割
- Fragment（View）
  - 状態の表示
  - ユーザー操作やライフサイクルイベントを Presenter に通知
  - Contract.View の実装
- Presenter
  - ビジネスロジックの提供
  - View の表示状態の変更
  - Contract.Presenter の実装
- Contract
  - View： Presenter が View の表示状態を変更するための Interface
  - Presenter： View が Presenter にユーザー操作やライフサイクルイベントを通知するための Interface

## 画面
| 初期状態 | カウント時 | エラー時 |
|:--:|:--:|:--:|
| <img src="https://github.com/Kaito-Dogi/android-sample-mvp/assets/49048577/cb970a22-9f0e-4736-b2f3-7e5ece038ea6" width="300px" alt="mvp_count_init" /> | <img src="https://github.com/Kaito-Dogi/android-sample-mvp/assets/49048577/2c093892-bcdd-4195-b82e-b4ada760b404" width="300px" alt="mvp_count_incr" /> | <img src="https://github.com/Kaito-Dogi/android-sample-mvp/assets/49048577/2aa8f1d1-cf6b-4919-9020-7ae808f534c3" width="300px" alt="mvp_count_error" /> |
