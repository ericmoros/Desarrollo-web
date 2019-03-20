{!! Form::open(array('route' => 'route.name', 'method' => 'POST')) !!}
	<ul>
		<li>
			{!! Form::label('producto', 'Producto:') !!}
			{!! Form::text('producto') !!}
		</li>
		<li>
			{!! Form::label('tienda', 'Tienda:') !!}
			{!! Form::text('tienda') !!}
		</li>
		<li>
			{!! Form::label('unidades', 'Unidades:') !!}
			{!! Form::text('unidades') !!}
		</li>
		<li>
			{!! Form::submit() !!}
		</li>
	</ul>
{!! Form::close() !!}