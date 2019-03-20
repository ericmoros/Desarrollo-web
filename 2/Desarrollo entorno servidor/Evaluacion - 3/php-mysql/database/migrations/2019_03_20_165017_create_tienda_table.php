<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;

class CreateTiendaTable extends Migration {

	public function up()
	{
		Schema::create('tienda', function(Blueprint $table) {
			$table->integer('cod')->primary();
			$table->string('nombre', 100);
			$table->string('tlf', 13)->nullable();
		});
	}

	public function down()
	{
		Schema::drop('tienda');
	}
}