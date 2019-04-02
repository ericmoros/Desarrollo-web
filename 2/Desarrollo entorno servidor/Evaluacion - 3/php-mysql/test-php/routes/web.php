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
$router->get('/producto', ['uses' => 'ProductoController@index']);
$router->get('/stock', ['uses' => 'StockController@index']);
$router->get('/tienda', ['uses' => 'TiendaController@index']);