package com.example.benchat.domain.viewModels

import androidx.lifecycle.ViewModel
import com.example.benchat.domain.entities.MyUser
import com.example.benchat.domain.entities.User
import com.example.benchat.domain.interfaces.IAuthenticationService
import com.example.benchat.infrastructure.dataAccess.repositories.MyUserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

//TODO: Annotate this class with @HiltViewModel, so it can be access in any Composable function
//This vm needs from interfaces  or services so the hilt Annotation should be used here.
@HiltViewModel
class AuthViewModel @Inject constructor(
    val authenticationService: IAuthenticationService,
  private  val myUserRepository: MyUserRepository
): ViewModel() {
    //Ui State
    private val _auth = MutableStateFlow(User());
    val authState: StateFlow<User>  = _auth.asStateFlow();

    fun afterLogin ( )  {
        _auth.update { state ->
            state.copy( // adding data to the state.
                username = "peter",
                auth_token = "8474948487743"
            )

        }
    }

    fun getAllUsers(): List<MyUser>{
      return  myUserRepository.getAllUsers();
    }
    fun saveUser(user: MyUser){
        myUserRepository.saveUser(user);
    }
    fun deleteUser(user: MyUser){
        myUserRepository.deleteUser(user);
    }

}