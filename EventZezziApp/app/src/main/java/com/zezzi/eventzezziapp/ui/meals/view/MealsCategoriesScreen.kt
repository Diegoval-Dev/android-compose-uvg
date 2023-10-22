package com.zezzi.eventzezziapp.ui.meals.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.zezzi.eventzezziapp.R
import com.zezzi.eventzezziapp.navigation.AppBar
import com.zezzi.eventzezziapp.navigation.NavigationState

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun MealsCategoriesScreen(
    navController: NavController,
    viewModel: MealsCategoriesViewModel = viewModel()
) {
    if (viewModel.categoryUiState.categories.isEmpty()) {
        viewModel.getMeals()
    }

    Scaffold(
        topBar = {
            AppBar(title = "Categories", navController = navController)
        }
    ) {
        if (viewModel.categoryUiState.loading) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(
                    modifier = Modifier.width(64.dp),
                    color = MaterialTheme.colorScheme.primary
                )
            }
        } else {
            LazyVerticalGrid(
                columns = GridCells.Fixed(1),
                contentPadding = it,
                modifier = Modifier
                    .background(Color.Gray)
                    .padding(start = 10.dp, end = 10.dp)
            ) {
                items(viewModel.categoryUiState.categories) { meal ->
                    Card(
                        shape = RoundedCornerShape(8.dp),
                        elevation = 2.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp)
                            .background(Color.Gray),
                        onClick = {
                            navController.navigate("${NavigationState.RecipesScreen.route}/${meal.name}")
                        }
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ){
                            AsyncImage(
                                model = meal.imageUrl,
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 10.dp, bottom = 10.dp, end = 2.dp)
                                    .width(110.dp)
                                    .height(150.dp),
                                placeholder = painterResource(R.drawable.placeholderimage)
                            )
                            Column(
                                modifier = Modifier
                                    .padding(16.dp)
                                    .fillMaxWidth(),
                                horizontalAlignment = Alignment.Start
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ){
                                    Text(
                                        text = "Categorie:",
                                        textAlign = TextAlign.Center,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(top = 5.dp),
                                        lineHeight = 2.sp
                                    )
                                    Text(
                                        text = meal.name,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier
                                            .padding(top = 5.dp, start = 5.dp),
                                        lineHeight = 2.sp
                                    )
                                }
                                Divider(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 1.dp),
                                    color = Color.Black,
                                    thickness = 1.dp
                                )
                                Text(
                                    text = "Description:",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(top = 5.dp),
                                    lineHeight = 2.sp
                                )
                                Text(
                                    text = meal.description,
                                    textAlign = TextAlign.Start,
                                    modifier = Modifier
                                        .padding(top = 5.dp, start = 1.dp),
                                    lineHeight = 15.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}