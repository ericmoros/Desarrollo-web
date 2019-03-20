<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;

class CreateStockTable extends Migration {

	public function up()
	{
		Schema::create('stock', function(Blueprint $table) {
			$table->string('producto', 12)->primary();
			$table->integer('tienda')->primary();
			$table->integer('unidades');
		});
	}

	public function down()
	{
		Schema::drop('stock');
	}
}