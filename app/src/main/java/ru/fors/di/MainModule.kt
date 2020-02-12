package ru.fors.di

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import org.koin.experimental.builder.singleBy
import ru.fors.auth.presentation.view.fragment.AuthFragment
import ru.fors.auth.router.AuthRouter
import ru.fors.presentation.viewmodel.AppViewModel
import ru.fors.router.AppRouter

/**
 * Created by 23alot on 04.02.2020.
 */
val routerModule = module {
    single { AppRouter(get()) }
    singleBy<AuthRouter, AppRouter>()
    viewModel { AppViewModel(get()) }
}