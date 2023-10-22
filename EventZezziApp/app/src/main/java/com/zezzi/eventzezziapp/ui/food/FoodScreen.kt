package com.zezzi.eventzezziapp.ui.food

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
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


@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun FoodScreen(
    navController: NavController,
    name: String,
    viewModel: FoodViewModel = viewModel()
){
    if(viewModel.foodUiState.food.isEmpty()){
        viewModel.getFood(name)
    }
    Scaffold(
        topBar = {
            AppBar(title = "Recipe for $name", navController = navController)
        }
    ) {
        if (viewModel.foodUiState.loading) {
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
            val food = viewModel.foodUiState.food.getOrNull(0)
            LazyColumn(
                contentPadding = it,
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxSize()
            ) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (food != null) {
                            Text(
                                text = food.name,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                            )
                        }
                    }
                }
                item{
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(170.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        if (food != null) {
                            AsyncImage(
                                model = food.imagenUrl,
                                contentDescription = null,
                                modifier = Modifier
                                    .width(150.dp)
                                    .height(150.dp),
                                placeholder = painterResource(R.drawable.placeholderimage)
                            )
                        }
                    }
                }
                item{
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Column {
                            Text(
                                text = "Ingredients:",
                                modifier = Modifier
                                    .height(40.dp)
                                    .padding(top = 10.dp),
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                            if (food != null) {
                                food.ingrediente1?.let { it1 -> Text(text = it1) }
                                food.ingrediente2?.let { it1 -> Text(text = it1) }
                                food.ingrediente3?.let { it1 -> Text(text = it1) }
                                food.ingrediente4?.let { it1 -> Text(text = it1) }
                                food.ingrediente5?.let { it1 -> Text(text = it1) }
                                food.ingrediente6?.let { it1 -> Text(text = it1) }
                                food.ingrediente7?.let { it1 -> Text(text = it1) }
                                food.ingrediente8?.let { it1 -> Text(text = it1) }
                                food.ingrediente9?.let { it1 -> Text(text = it1) }
                                food.ingrediente10?.let { it1 -> Text(text = it1) }
                                food.ingrediente11?.let { it1 -> Text(text = it1) }
                                food.ingrediente12?.let { it1 -> Text(text = it1) }
                                food.ingrediente13?.let { it1 -> Text(text = it1) }
                                food.ingrediente14?.let { it1 -> Text(text = it1) }
                                food.ingrediente15?.let { it1 -> Text(text = it1) }
                                food.ingrediente16?.let { it1 -> Text(text = it1) }
                                food.ingrediente17?.let { it1 -> Text(text = it1) }
                                food.ingrediente18?.let { it1 -> Text(text = it1) }
                                food.ingrediente19?.let { it1 -> Text(text = it1) }
                                food.ingrediente20?.let { it1 -> Text(text = it1) }
                            }
                        }
                        Column {
                            Text(
                                text = "Measures:",
                                modifier = Modifier
                                    .height(40.dp)
                                    .padding(top = 10.dp),
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                            if (food != null) {
                                food.medida1?.let { it1 -> Text(text = it1) }
                                food.medida2?.let { it1 -> Text(text = it1) }
                                food.medida3?.let { it1 -> Text(text = it1) }
                                food.medida4?.let { it1 -> Text(text = it1) }
                                food.medida5?.let { it1 -> Text(text = it1) }
                                food.medida6?.let { it1 -> Text(text = it1) }
                                food.medida7?.let { it1 -> Text(text = it1) }
                                food.medida8?.let { it1 -> Text(text = it1) }
                                food.medida9?.let { it1 -> Text(text = it1) }
                                food.medida10?.let { it1 -> Text(text = it1) }
                                food.medida11?.let { it1 -> Text(text = it1) }
                                food.medida12?.let { it1 -> Text(text = it1) }
                                food.medida13?.let { it1 -> Text(text = it1) }
                                food.medida14?.let { it1 -> Text(text = it1) }
                                food.medida15?.let { it1 -> Text(text = it1) }
                                food.medida16?.let { it1 -> Text(text = it1) }
                                food.medida17?.let { it1 -> Text(text = it1) }
                                food.medida18?.let { it1 -> Text(text = it1) }
                                food.medida19?.let { it1 -> Text(text = it1) }
                                food.medida20?.let { it1 -> Text(text = it1) }
                            }
                        }
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        Text(
                            text = "Instructions",
                            modifier = Modifier
                                .height(40.dp)
                                .padding(top = 10.dp),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                item{
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        if (food != null) {
                            food.instrucciones?.let { it1 ->
                                Text(
                                    text = it1,
                                    modifier = Modifier
                                        .height(40.dp)
                                        .padding(top = 10.dp),
                                    fontSize = 15.sp,
                                    textAlign = TextAlign.Start
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}