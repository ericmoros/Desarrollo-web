<?php

/*
|--------------------------------------------------------------------------
| Application Routes
|--------------------------------------------------------------------------
|
| Here is where you can register all of the routes for an application.
| It is a breeze. Simply tell Lumen the URIs it should respond to
| and give it the Closure to call when that URI is requested.
|
*/

$router->get('/', function () use ($router) {
    return $router->app->version();
});

$router->get('/conf', function () {
    return '
    add to php.ini: extension=php_pdo_mysql.dll<br/>
    then do: php artisan migrate
    ';
});

$router->get('/users', ['uses' => 'UsersController@index']);
$router->get('/familia', ['uses' => 'FamiliaController@index']);
$router->get('/familia/{id}', ['uses' => 'FamiliaController@show']);
$router->post('/familia', ['uses' => 'FamiliaController@create']);
$router->put('/familia/{id}', ['uses' => 'FamiliaController@update']);
$router->get('/familia/{id}/borrar', ['uses' => 'FamiliaController@destroy']);
$router->get('/producto', ['uses' => 'ProductoController@index']);
$router->get('/producto/{id}', ['uses' => 'ProductoController@show']);
$router->post('/producto', ['uses' => 'ProductoController@create']);
$router->put('/producto/{id}', ['uses' => 'ProductoController@update']);
$router->get('/producto/{id}/borrar', ['uses' => 'ProductoController@destroy']);
$router->get('/stock', ['uses' => 'StockController@index']);
$router->get('/stock/tienda/{idTienda}', ['uses' => 'StockController@show']);
$router->get('/stock/producto/{idProducto}', ['uses' => 'StockController@show']);
$router->get('/stock/{idTienda}/{idProducto}', ['uses' => 'StockController@show']);
$router->post('/stock', ['uses' => 'StockController@create']);
$router->put('/stock/{id}', ['uses' => 'StockController@update']);
$router->get('/stock/{id}/borrar', ['uses' => 'StockController@destroy']);
$router->get('/tienda', ['uses' => 'TiendaController@index']);
$router->get('/tienda/{id}', ['uses' => 'TiendaController@show']);
$router->post('/tienda', ['uses' => 'TiendaController@create']);
$router->put('/tienda/{id}', ['uses' => 'TiendaController@update']);
$router->get('/tienda/{id}/borrar', ['uses' => 'TiendaController@destroy']);